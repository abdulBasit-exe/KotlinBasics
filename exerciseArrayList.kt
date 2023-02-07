package Basics

fun main(){
    var arrayList = arrayListOf<Double>(10.10,9.65,11.00,12.91,8.82)
    var total=0.00
    for(i in arrayList){
        total+=i
    }
//    print(total)

    var avg = (total/arrayList.size)
    print("total of array list is: $avg")
}