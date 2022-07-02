package io.jyryuitpro.lab3.test1

import java.text.SimpleDateFormat
import java.util.*

var data = 10

fun formatDate(date: Date): String {
    // 코틀린의 객체 생성 시, new 연산자 자체가 없다.
    val sdformat = SimpleDateFormat("yyyy-mm-dd")
    return sdformat.format(date)
}

class User {
    var name = "hello"

    fun sayHello() {

    }
}