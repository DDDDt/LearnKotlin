package com.dt.learn.classObject

/**
 * @author dt 2018/11/28 17:28
 */
class LearnClassExtend {

    // 伴生对象 -> 单例的
    companion object Factory{
        fun create(): LearnClassExtend = LearnClassExtend()
    }

}