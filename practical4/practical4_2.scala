def classifyNumber(num : Int): String = num match {
    case num if num <= 0 => s"$num is Negative/Zero"
    case num if num % 2 == 0 => s"$num is even"
    case _ =>  s"$num is odd"
}

@main def practical4_2(arg : String): Unit = {
    val num = arg.toInt
    println(classifyNumber(num))
}