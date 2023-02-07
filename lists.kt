package Basics

fun main(){
    val months = listOf("jan","feb","march")
    var numbers = listOf(2,4,56,4)
    var array = arrayListOf(1,2,65,432,0)
//    println(numbers)
//    print(array)
    // to add other items in a list.
    // first make it mutabble with method toMutable.
    var additionalMonths = months.toMutableList();
    var newMonths = listOf("april","may","june")
    additionalMonths.addAll(newMonths)
    additionalMonths.add("july")
    println(additionalMonths)


    // making a already mutable list.

    var days = mutableListOf<String>("monday","tuesday","wednesday")
    println(days)
    days.add("thursday")
    println(days)

    // Removing an item from a list
//    days.removeAt(1)
    var removable = mutableListOf<String>("tuesday","wednesday")
    // removing multiple items at a time with removeAll method
    days.removeAll(removable)
    println(days)




}
