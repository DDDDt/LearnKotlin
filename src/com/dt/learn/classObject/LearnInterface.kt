package com.dt.learn.classObject

/**
 * @author dt 2018/11/26 18:12
 * Kotlin 接口
 * 类似于 Java8, 既包含抽象方法的声明, 也包含实现. 与抽象类不同的是, 接口无法保存状态,
 * 它可以有属性但必须声明为抽象或提供访问器实现
 */
interface LearnInterface {

    val prop: Int // 抽象的属性

    fun bar()

    fun foo(){
        // 可选的方法体
    }

}