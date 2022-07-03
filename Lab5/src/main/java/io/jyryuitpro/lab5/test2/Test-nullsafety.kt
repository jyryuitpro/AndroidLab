package io.jyryuitpro.lab5.test2

fun some(data: String?): Int? {
//    return data.length error...
    return data?.length
}

fun some2(data: String?): Int {
//    return data.length error...
    return data?.length ?: 0
//    return data!!.length 가능
}

fun main() {
    var data: String? = "kkang"
    println("data = $data : ${data?.length ?: -1 }")
    data = null
    println("data = $data : ${data?.length ?: -1 }")
}