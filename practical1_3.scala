object main extends App {
    var pi = 3.14

    def calvolume(r: Double): Double = 4/3*pi*r*r*r

    println(s"volume = ${calvolume(5)}")
}