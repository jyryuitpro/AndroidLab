package io.jyryuitpro.lab4.test4

class NonDataClass(val name: String, val email: String, val age: Int)

data class DataClass(val name: String, val email: String, val age: Int) {
    lateinit var address: String

    constructor(name: String, email: String, age: Int, address: String): this(name, email, age) {
        this.address = address
    }
}

fun main() {
    val non1 = NonDataClass("kkang", "a@a.com", 10)
    val non2 = NonDataClass("kkang", "a@a.com", 10)

    val data1 = DataClass("kkang", "a@a.com", 10, "seoul")
    val data2 = DataClass("kkang", "a@a.com", 10, "busan")

    println("non1, non2 ${non1.equals(non2)}")
    println("data1, data2 ${data1.equals(data2)}")

    val name = data1.name
    val email = data1.email

    val (name1, email1) = data1
    println("$name1, $email1")
}