package io.jyryuitpro.lab3.test3

fun main() {
    fun some(data1: Int, data2: Int = 10): Int {
        return data1 + data2
    }
    some(10)
    some(10, 20)
    some(data2 = 20, data1 = 10)

    val data1: Array<Int> = Array(3, {0})
    data1[0] = 10
    data1[1] = 20
    data1.set(2, 30)

    println("${data1.size}, ${data1[0]}, ${data1.get(2)}")

    val data2 = arrayOf<Int>(10, 20, 30)

    // list..........................
    // 값 변경 불가능
    var list = listOf<Int>(10, 20, 30)
    list.get(0)

    var list2 = mutableListOf<Int>(10, 20, 30)
    list2.get(0)
    // 값 변경
    list2.set(1, 30)
}