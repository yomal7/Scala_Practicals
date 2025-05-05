def calculateSquare(list: List[Int]): List[Int] = {
    list.map((i:Int) => i*i)
}

@main def practical7_2(): Unit= {
    val list1 = List(1,2,3,4,5)
    val list2 = calculateSquare(list1)
    list2.foreach(i => println(i))
}