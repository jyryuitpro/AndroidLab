package io.jyryuitpro.lab3.test4

fun main() {
    var data = 10
    val result = if (data > 0) {
        // kotlin.Unit: 함수를 Unit타입으로 선언하고 return 구문을 안썼을 경우 그럼 기본이 Unit이다.
        println("data > 0")
        10
    } else {
        // kotlin.Unit: 함수를 Unit타입으로 선언하고 return 구문을 안썼을 경우 그럼 기본이 Unit이다.
        println("data < 0")
        0
    }
    println(result)

    var data2: Any = 10
    val result3 = when (data2) {
        is String -> println("String....")
        20, 30 -> println("20, 30....")
        in 1..10 -> println("1..10")
        else -> println("else....")
    }
    println(result3)

    var data3 = arrayOf(10, 20, 30)
    for (i in data3.indices) {
        println(data3[i])
    }

    for ((index, value) in data3.withIndex()) {
        println(value)
    }
}