package com.dt.learn.classObject

/**
 * @author dt 2018/11/27 18:34
 * 数据类
 */
data class User(val name: String?, val age: Int)

fun testNull(user: User?): User? {
    user ?: return null
    return User("dt",1)
}

fun main(args: Array<String>) {

/*    val user: User? = null

    println(user?.name.isNullOrEmpty())

    println(testNull(null))

    val a = ""
    val b = a ?: "123"

    println(b)*/

//    val li = listOf<Int>(1,2,3,4,1)
//    val a = li.mapNotNull { it.rangeTo(10).map { it } }
//    println(a)

//    val s = li.associate { Pair(it,it + 1) }
//    println(s)

    val map1 = mapOf<String,String>("1" to "6")
    val map2 = mapOf<String,String>("2" to "4")
    val map3 = mapOf<String,String>("3" to "5")

    val li = listOf<Map<String,String>>(map1,map2,map3)
    val a = li.reduce { acc, map ->  acc + map}

    println(a)

}