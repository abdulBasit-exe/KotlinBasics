package Basics

import java.lang.ArithmeticException

fun main(){
    var a:Int=50
    var b:Int=0
    try{
        val c:Int =a/b
        println(c)
    }
    catch (e:NullPointerException){
//        println("")
    }
    finally {
        println("inside the finally block!")
    }


}