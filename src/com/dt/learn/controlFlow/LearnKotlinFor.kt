package com.dt.learn.controlFlow

/**
 * @author dt 2018/11/26 16:16
 * for 循环
 */
object LearnKotlinFor {

    @JvmStatic
    fun main(args: Array<String>) {

        val arr = arrayOf(1,2,3,4,5,6)
        for (item in arr) println(item)

        for((index,value) in arr.withIndex()) println("index = $index,value = $value")

    }

}