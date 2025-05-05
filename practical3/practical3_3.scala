def calcAverage(num1 : Int, num2: Int ): Double = BigDecimal((num1+num2).toDouble/2).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble

@main def practical3_3(): Unit = {
    val num1 = 23
    val num2 = 34
    val ans = calcAverage(num1, num2)
    println(f"average of $num1 and $num2 = $ans%.2f")
}

