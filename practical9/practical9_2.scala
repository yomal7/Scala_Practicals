 def checkNumber(): Unit = {
    val num = scala.io.StdIn.readLine("Enter a integer: ")
    num.toIntOption match {
        case None => 
            println("Invalid input. Please enter a valid integer.")
            checkNumber() 
        case Some(intg) =>
            intg match {
                case n if n <= 0 => println(s"${n} is Negative/Zero")
                case n if n % 2 == 0 => println(s"${n} is Even")
                case _ => println(s"${intg} is Odd")
            }
    }
}

@main def practical9_2(): Unit = {
    checkNumber()
}


