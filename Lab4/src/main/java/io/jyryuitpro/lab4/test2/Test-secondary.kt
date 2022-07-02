package io.jyryuitpro.lab4.test2

class User(name: String) {
    constructor(name: String, count: Int): this(name) {
        println("constructor(name: String, count: Int)....")
    }

    constructor(name: String, count: Int, email: String): this(name, count) {
        println("constructor(name: String, count: Int, email: String)....")
    }
}

fun main() {
    val user1 = User("kkang", 10)
    val user2 = User("kkang", 10, "a@a.com")
}