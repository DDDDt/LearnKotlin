package com.dt.learn.controlFlow

import java.lang.Integer.parseInt

/**
 * @author dt 2018/11/26 16:06
 * when 循环类似于 switch
 */
object LearnKotlinWhen {

    @JvmStatic
    fun main(args: Array<String>) {

        // when 基础用法
        val x = 1
        when (x) {
            1 -> print("x == 1")
            2 -> print("x == 2")
            else -> {
                print("x is neither 1 nor 2")
            }
        }

        // 可以选择多个条件
        when(x){
            0,1 -> print("x == 0 or x == 1")
            else -> print("otherwise")
        }

        val s = "1"

        // 可以使用任意表达式
        when (x) {
            parseInt(s) -> print("s is Int")
            else -> print("s does not encode x")
        }

    }

}