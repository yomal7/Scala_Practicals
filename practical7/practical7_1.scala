def filterEverNumbers(list: List[Int]): List[Int]= {
    list.filter((i:Int)=> i%2 == 0)
}

@main def practical7_1(): Unit = {
    val list1 = List(1,2,3,4,5,6,7,8,9,10)
    val list2 = filterEverNumbers(list1)
    list2.foreach(i => println(i))
}