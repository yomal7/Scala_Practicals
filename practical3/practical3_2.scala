def greaterthan5String(strlist : List[String]): List[String] = {
    if(strlist.isEmpty) List()
    else{
        if(strlist.head.length > 5) strlist.head :: greaterthan5String(strlist.tail)
        else greaterthan5String(strlist.tail) 
    }
}


@main def practical3_2() : Unit = {
    val strlist = List("yomal", "cricket", "apple", "oshada", "sandun", "football")
    val newlist = greaterthan5String(strlist)
    println("list of Strings that have a length greater than 5 : ")
    newlist.foreach(item => println(item))
    
}