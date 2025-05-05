val iseven = (i: Int) => i%2 == 0
val isprime = (i: Int) => i>0 && (2 to math.sqrt(i).toInt).forall((n:Int)=> i%n != 0)

@main def main(): Unit = {
    println(iseven(3))
    println(isprime(8))
}