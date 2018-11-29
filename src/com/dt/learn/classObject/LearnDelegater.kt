package com.dt.learn.classObject

/**
 * @author dt 2018/11/28 18:00
 * 委托模式
 */

interface Base{
    fun print()
}

class BaseImpl(val x: Int): Base{

    override fun print() { print(x) }

}

class Derived(b: Base): Base by b

fun main(args: Array<String>) {
    val b = BaseImpl(10)
    Derived(b).print()
}