package com.dt.learn.classObject

/**
 * @author dt 2018/11/27 18:34
 * 数据类
 */
data class User(val name: String?, val age: Int)

fun main(args: Array<String>) {

    val user: User? = null

    println(user?.name.isNullOrEmpty())

}