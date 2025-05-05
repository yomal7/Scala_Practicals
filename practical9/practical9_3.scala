val toUpper = (str: String) => str.toUpperCase()
val toLower = (str: String) => str.toLowerCase()

def formatNames(name: String)(func: String => String): String = func(name)

@main def practical9_3(): Unit = {
    val output1 = formatNames("Benny")(toUpper)
    println(output1)
    val output2 = formatNames("Niroshan")(str => str.take(2).toUpperCase() +  str.drop(2).toLowerCase())
    println(output2)
    val output3 = formatNames("Saman")(toLower)
    println(output3)
    val output4 = formatNames("Kumara")(str => str.init + str.last.toString().toUpperCase())
    println(output4)
    
}