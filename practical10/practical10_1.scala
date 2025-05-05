@main def practical10_1(): Unit = {
    case class Rational(val p: Int, var b: Int = 1) {

        val q: Int = if (b > 0) b else 1

        def printRational(): Unit = {
            println(s"$p/$q = ${p * 1.0 / q}")
        }

        def neg(): Rational = {
            Rational(-p, q)
        }
    }

    val r1 = Rational(5)
    r1.printRational()
    
    val r2 = r1.neg()
    r2.printRational()
}
