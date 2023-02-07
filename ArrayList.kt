package Basics

fun main(){
    // Arraylist is a dynamic array. To change the elements at ant time simply.
    var list:MutableList<String> = mutableListOf<String>()

    var arrayList: ArrayList<String> = ArrayList<String>()
    list.add("basit")
    list.add("muzammil")
    list.add("uzair")

    arrayList.addAll(list)
    for (i in list){
        println(i)
    }

}