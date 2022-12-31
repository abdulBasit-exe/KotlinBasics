package learning.appdev.kotlinbasics
data class User(val id: Int, val name: String){
}
fun main(){
    var user1 = User(1,"basit")
    var user2 = User(1,"basit")

    if (user1==user2){
//        If it is a Data class, the values are same, it will be considered as equal, otherwise if
    //    it is a simple class then it will be considered as not equal because referance of
        //both is changed
        println("equal")
    }
    else print("not equal")

    // Copy Method

    var newUser = user1.copy(name="samad")
    println(newUser)

}
