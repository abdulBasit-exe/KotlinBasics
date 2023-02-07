package Basics

fun main(){

    val daysOfWeek = mapOf(1 to "mon",2 to "tue", 3 to "wed")
    // also called hashMap in other languages.
    println(daysOfWeek[2])

    for(key in daysOfWeek.keys){
        println("$key is to ${daysOfWeek[key]}")
    }

    var mapOfCar = mapOf(1 to Car("civic",19), 0 to Car("cultus",20), 3 to Car("city",10))

    for(key in mapOfCar.keys){
        println("$key is to ${mapOfCar[key]}")
    }

    var newCarMap = mapOfCar.toSortedMap()
    println("sorted map: $newCarMap")


}

data class Car(var name: String, var model: Int){

}