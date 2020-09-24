package com.new.Kotlin.Exercise

import java.util.*

fun main() {
    var a: Int
    val input  = Scanner(System.`in`)
    println("Enter a Year")
    a = input.nextInt()

    when {
        a%400==0 -> println("Leap Year")
        a%4==0 && a%100!=0 -> println("Leap Year")
        else -> println("Not a Leap Year")
    }


}