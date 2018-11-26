package com.dt.learn.controlFlow

/**
 * @author dt 2018/11/26 16:27
 * 测试 return ,break,continue
 */
object LearnKotlinReturnBreakContinue {

    // return 直接一整块返回了, 没有在 lambda 中返回
    fun foo(){
        listOf<Int>(1,2,3,4,5).forEach {
            if(it == 3) return
            println(it)
        }
        println("结束")
    }

    // 使用标签来控制只在 lambda 中返回
    fun foo1(){
        listOf<Int>(1,2,3,4,5).forEach {
            if(it == 3) return@forEach
            println(it)
        }
        println("结束")
    }

    @JvmStatic
    fun main(args: Array<String>) {

        val s : Int = 0
        val a = s?: return
        println(a)

        // 使用 break,continue
        val arr: Array<Int> = arrayOf(1,2,3,4,5)

        // 默认直接将整个循环终结
        for (a in arr){
            println(a)
            if(a == 2) break
        }

        for(a in arr){
            if(a == 2) continue
            println(a)
        }

        // 在 Kotlin 中任何表达式都可以用标签 (label) 来标记. 标签的格式为标识符后跟 @ 符号
        // 用来控制返回位置
        loop@ for(a in arr){
            for(b in arr){
                println("a = $a, b = $b")
                if(a==2 && b==2) break@loop
            }
        }
        // 调用方法
        foo()

        foo1()

    }

}