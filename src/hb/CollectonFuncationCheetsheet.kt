package hb

fun main() {
    val list= listOf(1,2,3)  // List to demo
    println(list)  // print the list
    println( list.associateBy { "Key$it" })  // resturn a map containing key-value pairs created by lambda

   var a= listOf(1,2,3,null)
        .mapNotNull { it }
    println(a) // Returned list contains only elements that return not null from the lambda


// return a new list by transforming all elements from the initial iterable
                  //lambda receives an index as first value, element itself as second
}