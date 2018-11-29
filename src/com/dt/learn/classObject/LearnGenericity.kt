package com.dt.learn.classObject

/**
 * @author dt 2018/11/28 16:55
 * 泛型
 */
class Box<T>(t:T){
    var value = t
}

val box: Box<Int> = Box<Int>(1)