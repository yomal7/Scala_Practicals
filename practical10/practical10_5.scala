def countLetterOccurrences(list: List[String]): Int = list.map(i => i.length()).reduce((x,y) => x+y)

@main def practical10_5(): Unit = {
    val list: List[String] = List("apple", "banana", "cherry", "date")
    println(s"Total count of letter occurrences: ${countLetterOccurrences(list)}")
}