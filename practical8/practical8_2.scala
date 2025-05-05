def getNumber(): Int = {
  try {
    val input = scala.io.StdIn.readLine("Enter an integer: ")
    input.toInt
  } catch {
    case _: NumberFormatException =>
      println("That's not a valid integer. Please try again.")
      getNumber()
  }
}

def printMessage(): Unit = {
  val num = getNumber()
  num match {
    case n if n != 0 && n % 3 == 0 && n % 5 == 0 => println(s"$n, Multiple of both Three and Five.")
    case n if n != 0 && n % 3 == 0 => println(s"$n, Multiple of Three.")
    case n if n != 0 && n % 5 == 0 => println(s"$n, Multiple of Five.")
    case _ => println(s"$num, Not a multiple of Three and Five.")
  }
}

@main def practical8_2(): Unit = {
  printMessage()
}