@main def practical2_4(): Unit ={
        
    def attendence(ticketPrice: Int): Int = 120 + (15-ticketPrice)/5 *20

    def varCost(ticketPrice: Int):Int = attendence(ticketPrice)*3

    def totalCost(ticketPrice: Int): Int = 500 + varCost(ticketPrice)

    def income(ticketPrice: Int):Int = ticketPrice * attendence(ticketPrice)

    def profit(ticketPrice: Int): Int = income(ticketPrice) - totalCost(ticketPrice)

    println("ticket price 10  -> profit = " + (profit(10)))
    println("ticket price 15  -> profit = " + (profit(15)))
    println("ticket price 20  -> profit = " + (profit(20)))
    println("ticket price 25  -> profit = " + (profit(25)))
    println("ticket price 30  -> profit = " + (profit(30)))
    println("ticket price 35  -> profit = " + (profit(35)))
}

  
