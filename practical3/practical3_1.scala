def reverseString(str : String) : String = {
    if(str.isEmpty || str.length == 1) str
    else reverseString(str.tail) + str.head      
} 

@main def pracrical3_1(): Unit = {
    val str = "This string needs to be reversed"
    val reversestr : String = reverseString(str)

    println("String : "+ str)
    println("Reversed String : "+ reversestr)    
}