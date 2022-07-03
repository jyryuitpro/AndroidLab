package io.jyryuitpro.lab4.test5

open class Super {
    open var data1 = 10
    open fun some() {

    }
}

val obj = object : Super() {
    var data = 10
    override var data1 = 10
    override fun some() {
        data1++
    }
}

fun main() {
//    obj.data1++ error => Any 타입...
    obj.data1++ // Super 타입...
//    obj.data++ error
}