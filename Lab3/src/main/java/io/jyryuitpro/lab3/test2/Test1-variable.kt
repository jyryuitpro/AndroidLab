package io.jyryuitpro.lab3.test2

val data1 = 10
var data2 = 10

fun myFun() {
//    data1 = 20 => error
    data2 = 20
}

// 기초 데이터 타입 또는 val은 lateinit 불가능
//lateinit var data3: Int => error

class User
lateinit var user: User
lateinit var data4: String

// by lazy: val 변수도 가능
val data5 by lazy {
    println("in lazy....")
    10
}

fun main() {
    println("main....")
    println(data5)
    println(data5)
}