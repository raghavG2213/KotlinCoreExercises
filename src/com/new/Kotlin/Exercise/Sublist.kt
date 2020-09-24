package com.new.Kotlin.Exercise

import java.util.*

fun main() {

    var (a,b) = listInput()
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

fun listInput(): Pair<List<Int>, List<Int>>{
    val read = Scanner(System.`in`)
    var no: Int
    var l1 = mutableListOf<Int>()
    var l2 = mutableListOf<Int>()
    println("Enter the no. of elements in the First list: ")
    no = read.nextInt()
    println("Enter List : ")
    for(i in 0 until no){
        l1.add(read.nextInt())
    }
    println("Enter the no of elements of Second list: ")
    no = read.nextInt()
    println("Enter List: ")
    for(i in 0 until no){
        l2.add(read.nextInt())
    }
    return Pair(l1,l2)

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