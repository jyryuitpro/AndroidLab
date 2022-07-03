package io.jyryuitpro.lab4.test5

class MyClass {
    var data = 10
    companion object {
        var data1 = 10
        fun some() {

        }
    }
}

fun main() {
//    MyClass.data++ error =>
    MyClass().data++

    MyClass.data1++
    MyClass.some()

//    MyClass().data1 error
}