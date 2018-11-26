package com.dt.learn.classObject

/**
 * @author dt 2018/11/26 17:06
 * 类的一些相关属性学习
 */

/**
 * 没有类体
 */
class Empty

// 构造函数,使用 constructor 来构造构造函数.如果主构造函数没有任何注解或者可见性修饰符, 可以省略 constructor 关键字
class Person constructor(firstName: String){

    val fName = firstName.toUpperCase()

}

// 胜率 construct 和使用 init 初始化块
class InitOrderDemo(name: String){

    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints $name")
    }

    val secondProperty = "second property: $name".also(::println)

    init {
        println("Second initializer block that prints $name")
    }

}

// 构造函数声明属性一级主构造函数初始化属性. 可以全部放在构造函数中使用, var 可变, val 只读的
class Person1(val firstName: String,val lastName: String,var age: Int)

// 如果构造函数有注解或可见性修饰符, constructor 是必须的
class Customer public constructor(name: String)

// 次构造函数
class PersonCon{
    constructor(parent: PersonCon) {
//        parent.children.add(this)
    }
}
// 如果类有一个主构造函数, 每个次构造函数需要委托给主构造函数, 可以直接委托或者通过别的次构造函数间接委托. 委托到同一个类的另一个构造函数用 this 关键字即可
class PersonCon1(val name: String){
    constructor(name: String,parent: PersonCon1): this(name){
//        parent.children.add(this)
    }
}

// 创建类的实例, 不用 new 来实例化
val person = Person("dt")

// 继承, Kotlin 中所有类都有一个共同的超类 Any. Any 并不是 java.lang.Object. 对于没有超类型声明的类是默认超类
// 方法重写 -> 与 java 不一样, 被重写的成员需要显示修饰符修饰 open
// 覆盖属性也需要
// 使用 super 来调用基类
open class Base(p: Int){
    open val x: Int = 1
    open fun v(){}
    fun nv(){}
}

// 从 Base 继承
class Derived(p: Int): Base(p){
    override val x: Int = super.x + 1
    override fun v(){}
}

// 抽象类

// 伴生对象