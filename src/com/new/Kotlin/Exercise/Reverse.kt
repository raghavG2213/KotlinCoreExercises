package com.new.Kotlin.Exercise

import java.util.Scanner

fun reverse(str: String): String {

    val chars = CharArray(str.length)
    for(x in str.indices){
        chars[x] = str[str.length - x - 1]
    }
    return String(chars)
}

fun main() {
    println("Enter the String: ")
    var input = Scanner(System.`in`)
    val str = input.nextLine()
    println("Reverse of $str is : " + reverse(str))
}