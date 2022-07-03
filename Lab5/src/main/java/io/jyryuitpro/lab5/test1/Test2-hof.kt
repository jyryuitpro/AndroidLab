package io.jyryuitpro.lab5.test1

//fun hofFun(arg: (Int) -> Boolean): () -> String {
fun hofFun(no: Int, arg: (Int) -> Boolean): () -> String {
    val result = if (arg(10)) {
        "valid"
    } else {
        "invalid"
    }
    return {"hofFun result : $result"}
}

fun main() {
//    val result = hofFun({ no -> no > 10 })

    // 매개변수가 1개일 경우, it으로 축약 가능
//    val result = hofFun({ it > 10 })

    // 마지막 파라미터로 함수타입이 온 경우 [() 생략 개념]
    val result = hofFun(10) { it > 10 }
}