@main def practical10_2(): Unit = {
  case class Rational(p: Int, b: Int = 1) {
    val q: Int = if (b > 0) b else 1

    def printRational(): Unit = {
      println(s"$p/$q = ${p * 1.0 / q}")
    }

    def -(that: Rational): Rational = {
      if (this.q == that.q) {
        Rational(this.p - that.p, this.q)
      } 
      else {
        val newP = this.p * that.q - that.p * this.q
        val newQ = this.q * that.q
        Rational(newP, newQ)
      }
    }
  }

  val x = Rational(3, 4)
  val y = Rational(5, 8)
  val z = Rational(2, 7)

  val r3 = (x-y)-z
  r3.printRational()
}
