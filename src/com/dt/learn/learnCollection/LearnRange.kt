package com.dt.learn.learnCollection

/**
 * @author dt 2018/11/29 13:54
 * 学习区间
 */
fun main(args: Array<String>) {

    var i: Int = 1
    if(i in 1..10) println(i)

    for(n in 1..10) println(n)

    // 倒叙
    for(m in 1 downTo 10) println(m)

    // 设置任意步长迭代数字
    for(o in 1..10 step 2) println(o)

    // 不包括结束元素的区间
    for(t in 1 until 10) println(t)

}