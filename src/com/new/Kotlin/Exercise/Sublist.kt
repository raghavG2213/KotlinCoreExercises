package com.new.Kotlin.Exercise

import java.util.*
import java.util.regex.Pattern

fun main() {

    val input = Scanner(System.`in`)

    var a = listOf<Int>(1,2,3,4)
    var b = listOf<Int>(1,2,3,4,4,1,2,3,4,5)

    var flag: Int = 0

    when{
        a.size < b.size -> {flag = subList(a,b)
                            println("A is a sublist of B")}
        a.size > b.size -> {flag = subList(a,b)
            println("A is a superlist of B")}
        a.size == b.size -> {flag = subList(a,b)
            println("A is equal to B")}
        else -> println("A is not a superlist of, sublist of or equal to B")
    }

}

fun subList(a: List<Int>, b: List<Int> ): Int{
    var flag = 0
    var e  = mutableListOf<Int>()
    for(x in b.indices){
        if(b[x] == a[0]){
            if(x + a.size - 1 <= b.size - 1)
                e.add(x)
        }
    }

    val c = b.indexOf(a[0])
    for (x in e){
        for (y in a.indices){
            flag = if(b[x+y] == a[y]) 1 else 0
        }
        if(flag == 1) break
    }
    return flag
}