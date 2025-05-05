object main extends App {
  var pi = 3.14

  def calarea(r: Double): Double = pi*r*r

  println(s"area = ${calarea(5)}")
}