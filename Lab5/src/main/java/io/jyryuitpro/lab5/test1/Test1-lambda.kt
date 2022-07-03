package io.jyryuitpro.lab5.test1

fun main() {
    { no: Int -> println(no) }(10)

    val some1: (Int) -> Unit = { no: Int -> println(no) }
    val some2 = { no: Int -> println(no) }
    val some3: (Int) -> Unit = { no -> println(no) }
//    val someF = { no -> println(no) } error
    // 매개변수가 1개일 경우
    val some5: (Int) -> Unit = { println(it) }
}