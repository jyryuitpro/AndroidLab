package io.jyryuitpro.lab3.test2

fun someFun() {
//    var data1: Int = null => error
    var data1: Int = 10
    var data2: Int? = 10
    data2 = null

    class User

    var user1: User? = User()
    user1 = null

    fun sum(no: Int): Int {
        var sum = 0
        for (i in 1..no) {
            sum += i
        }
        return sum
    }

    val name = "kkang"

    println("name : $name, sum: ${sum(10)}, plus : ${10 + 20}")
}