package com.dt.learn.learnCollection

/**
 * @author dt 2018/11/29 13:42
 * 学习集合的相关基本操作
 */

val numbers: MutableList<Int> = mutableListOf(1,2,3)

val readOnlyView: List<Int> = numbers

fun main(args: Array<String>) {

    println(numbers)

    numbers.clear()

    println(readOnlyView)

}
