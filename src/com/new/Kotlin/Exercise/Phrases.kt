package com.new.Kotlin.Exercise

import java.util.*

fun wordFrequency(str: String) {

    val counter = 0
    val b = str.split(" ".toRegex()).toTypedArray()
    println(b)
    val freqMap = HashMap<String, Int>()
    for (i in b.indices) {
        val key = b[i]
        var freq = freqMap.getOrDefault(key, 0)
        freqMap[key] = ++freq
    }
    println("Frequency of Words:")
    for ((key, value) in freqMap) {
        println("$key -> $value")
    }
}

fun main(args: Array<String>) {
    println("Enter the String : ")
    val string = readLine().toString()
    wordFrequency(string)
}