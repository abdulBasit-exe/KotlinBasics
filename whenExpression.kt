package learning.appdev.kotlinbasics

fun main(){
    // When Expression is a replacement for a Switch Expression
//    val num = 5
//    var result = num in 1..5 // 1,2,3,4,5
//    println(result)
//    result = num in 1 until 5 // 1,2,3,4 * Upper bound not included
//    println(result)

    // When, it is to replace if-else

//
//    when(value){
//        10 -> println("value is 10")
//        1 -> println("value is 1")
//        18 -> println("value is 18")
//        9 -> println("value is 9")
//        else-> print("value is $value")
//    }

    // * Using when as an expression

    val value =10
    var result=when(value) {
        10 -> println("value: 10")
        1 -> println("value: 1")
        18 -> println("value: 18")
        9 -> println("value: 9")
        else -> print("value is $value")
    }
    result
}