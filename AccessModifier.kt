package Basics

fun main(){
    var base1= Base()
    print(base1.a)
    print(base1.d)
}

open class Base{
    var a = 1
    private var b= 3
    protected open var c = 42
    internal var d = 4

}

class derived: Base(){
    override var c =0
}