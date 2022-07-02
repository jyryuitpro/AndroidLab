package io.jyryuitpro.lab4.test1

class User(val name: String, val count: Int) {
//    var name: String
//    var count: Int

//    init {
//        this.name = name
//        this.count = count
//    }

    fun someFun() {
        println("name $name, count $count")
    }
}

fun main() {
    val user = User("kkang", 10)
}