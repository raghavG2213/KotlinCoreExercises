package com.new.Kotlin.Exercise

import java.util.*
import java.util.stream.IntStream
import kotlin.math.pow
import kotlin.math.round
import kotlin.math.sign

fun main() {

    val a: Int
    val input  = Scanner(System.`in`)

    var e  = mutableListOf<Double>()
    var sum = 0.0

    println("Enter a number")
    a = input.nextInt()
    var d = a

    for (x in a.toString().indices){
        e.add(d%10.0)
        println(e)
        d /= 10
        println(d)
    }

    e.map { x -> sum += x.pow(e.size) }
    if(a.toDouble() == sum){
        println("Armstrong no.")
    }else{
        println("Not Armstrong")
    }

}