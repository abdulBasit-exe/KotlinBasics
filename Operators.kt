package learning.appdev.kotlinbasics

fun main(){

    var a=5.0
    var b=2
    var result= a+b
//    If a data type is change then we are equaling to,
//    first change it explicitly, then initialize it.

    // *Arithmetic
    var resultDouble: Double=result
    resultDouble/=2
//    print(resultDouble)

    var isEqual = 5==3
//    print(" Is Equal is: $isEqual")
    var isNotEqual = 5!=5
//    println("Is not equal is: $isNotEqual")

    // *Comparison
    println("is 5 greater 9: ${5>9}")

    // *Increment, Decrement
    var inc = 9
    var dec = 10
    println("inc=$inc")
    println("dec=$dec")
    println("inc after increment is: ${inc++}")
    println("inc after pre increment is: ${++inc}")
    println("dec after increment is: ${dec--}")
    println("dec after pre increment is: ${--dec}")



}
