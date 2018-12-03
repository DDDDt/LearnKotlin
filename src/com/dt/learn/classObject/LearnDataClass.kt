package com.dt.learn.classObject

/**
 * @author dt 2018/12/3 14:28
 */
data class LearnDataClass(
    val id: Int = 0,
    var name: String = ""
)

fun main(args: Array<String>) {

    val learnClass = LearnDataClass(1,"dt")

    println(learnClass)

    learnClass.name = "123"

    println(learnClass)


}