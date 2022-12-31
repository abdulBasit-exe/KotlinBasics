package learning.appdev.kotlinbasics

fun main(){
    var firstCar= Carr("Corolla","Toyota",1011)
    println("name: ${firstCar.name}\nmodel:${firstCar.model}")

}

class Carr(name: String, model: String,milege:Int){
    lateinit var name: String
    lateinit var model: String
    init{
        println("Inialiazed object with name $name and model $model")
        this.name=name;
        this.model=model
    }
    var milege: Int?=null
    set(milege){
        this.milege= milege
    }
    get(){
        return field
    }
}