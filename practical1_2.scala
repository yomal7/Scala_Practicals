object main extends App{
    def converter_c_f(c : Double): Double = c*1.8000 + 32.00

    println(s"Fahrenheit - ${converter_c_f(35)}")
}