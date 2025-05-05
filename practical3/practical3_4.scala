def calcSumofeven(list : List[Int]): Int = {
    if(list.isEmpty) 0
    else{
        val ptr = if(list.head %2 == 0) list.head else 0
        ptr + calcSumofeven(list.tail)
    }
}

@main def practical3_4(): Unit = {
    val list1 : List[Int] = List(2, 4, 5, 56, 3, 2, 56, 21, 12)
    val sum = calcSumofeven(list1)
    println("sum of the even numbers : "+ sum)
}