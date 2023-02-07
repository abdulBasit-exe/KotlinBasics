package Basics

import java.lang.Exception

fun main(){
    vote(10)
    println("rest of the code.")

}
fun vote(age:Int){
    if (age>=18){
        println("you can vote.")
    }
    else throw Exception("age less then 18.")
}