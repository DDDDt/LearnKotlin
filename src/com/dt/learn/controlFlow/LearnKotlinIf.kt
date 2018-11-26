package com.dt.learn.controlFlow

/**
 * @author dt 2018/11/26 16:03
 * 可以直接把代码块作为一个表达式的值
 */
object LearnKotlinIf {

    @JvmStatic
    fun main(args: Array<String>) {

        var a : Int = 1

        val b = 2

        val max = if(a > b){
            a
        }else{
            b
        }

        print(max)

    }

}