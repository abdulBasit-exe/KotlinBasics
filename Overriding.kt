package learning.appdev.kotlinbasics.inheritance

fun main(){
    var phone =Samsung("A32")
    phone.CarName()
}
open class Mobile(name: String){
    var name=name;
    fun CarName(){
        println("Mobile is: $name")
    }

    open fun CarName(name: String) {}
}
class Samsung(name: String) : Mobile(name){
    override fun CarName(name: String){
        println("Car is: $name")
    }
}

