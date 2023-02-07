package Basics

fun main(){
    var obj = OuterClass.InnerClass()
    println(obj.call())
}

class OuterClass{
    private var name ="Basit"

    class InnerClass{
        var description: String = "this is a inner class"
         var id: Int = 43

        fun call(){
//            print("calling ${this.name}") * Can not access the outer class member
            print(description)
        }
    }
}