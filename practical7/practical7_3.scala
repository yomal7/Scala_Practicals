def filterPrime(list: List[Int]) = {
    list.filter((i:Int) => i>1 && (2 to math.sqrt(i).toInt).forall(n=> i%n != 0))
}

@main def practical7_3(): Unit = {
    val list1 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val list2 = filterPrime(list1)
    list2.foreach(i => println(i))
}