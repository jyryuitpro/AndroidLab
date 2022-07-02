package io.jyryuitpro.lab4.test3

open class Super {
    var publicData = 10
    protected var protectedData = 10
    private var privateData = 10

    open var someData = 10
    open fun someFun() {}
}

class Sub : Super() {
    override var someData = 10
    override fun someFun() {
        publicData++
        protectedData++
//        privateData++ => error
    }
}

fun main() {
    val obj = Sub()
    obj.publicData++
//    obj.protectedData++ => error: 상관관계가 없어서 에러
//    obj.privateData => error: 클래스 밖에서는 이용이 불가능
}