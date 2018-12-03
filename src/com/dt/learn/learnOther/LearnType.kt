package com.dt.learn.learnOther

/**
 * @author dt 2018/11/29 14:21
 * 类型转换
 */
fun main(args: Array<String>) {

    val obj: String = "123"

    if(obj is String) println(obj.length)

    if(obj !is String) println(obj.toString())


    // 不安全的转换操作符
    val x: String? = obj as String?

    // 安全的转换操作符
    val x1: String? = obj as? String


}