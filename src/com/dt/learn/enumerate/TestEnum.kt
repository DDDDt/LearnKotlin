package com.dt.learn.enumerate

/**
 * @author dt 2019/1/7 17:43
 */
enum class TestEnum(val id: Int,val enName: String){

    TEST_ENUM(1,"DT");

}

fun main(args: Array<String>) {

    println(TestEnum.valueOf("TEST_ENUM").enName)

}