object main extends App{
    
    def coverprice(n : Int): Double = n*24.95

    def discount(n : Int): Double = n*24.95*0.4

    def price(n : Int): Double = coverprice(n) - discount(n)

    def shippingcost(n : Int): Double = if(n>50) 3 + (n-50)*0.75  else 3

    def calcost(n : Int): Double = price(n) + shippingcost(n)

    println(s"total cost = ${calcost(60)}")
}