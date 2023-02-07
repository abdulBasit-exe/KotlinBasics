package Basics

fun main(args: Array<String>){
    // throws an NullPointer exception
//    var obj:Any? = null
//    var str:String= obj as String
//    println(str)

//    throws a ClassCastException
//    var obj:Any = 123
//    var str:String= obj as String
//    println(str)

//    Nullable Casting to Work:
//      Source and target should be nullable for casting to work

//      String unsafe Cast

//      var obj: Any? = "this is a string"
//      var data: String? = obj as? String
//      println(data)

//      String safe casting using: as?

      var obj: Any? = 124
      var safeString: String? = obj as? String
      var safeInt: Int? = obj as? Int
      println(safeString)
      println(safeInt)

      // using a as? wont through a ClassCastException even if the source is null.
      // It would return null.



}