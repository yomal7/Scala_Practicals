def toUpper(str : String) : String = str.toUpperCase()

def toLower(str : String) : String = str.toLowerCase()

def formatNames(str : String)(format: String => String) = format(str)
@main def practical4_3(): Unit = {
    println(formatNames("Benny")(toUpper))
    println(formatNames("Niroshan")(str => toUpper(str.take(2)) + toLower(str.drop(2))))
    println(formatNames("Saman")(toLower))
    println(formatNames("Kumara")(str => str.head + toLower(str.drop(1).init) + str.last.toUpper))
}