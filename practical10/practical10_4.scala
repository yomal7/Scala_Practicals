@main def practical10_4(): Unit = {
    case class Account(val id: Int, var amount: Double){

        def currentBalance(): Unit = println(s"account id: $id\ncurrent balance: $amount\n")

        def calcAmountafterInterest() = {
            if(amount > 0){
                val value = amount
                amount = value + (value * 0.05)
            }
            else{
                val value = amount
                amount = value + (value * 0.1)
            }
        }
    }

    def printBank(list: List[Account]): Unit = list.foreach(i => println(s"accountId: ${i.id}\tamount: ${i.amount}"))

    def calcSum(list: List[Account]): Double = list.map(_.amount).sum

    def applyInterest(list: List[Account]): List[Account] = {
        list.foreach(i => i.calcAmountafterInterest())
        list
    }

    val ac1 = Account(1, 2000)
    val ac2 = Account(2, -200)
    val ac3 = Account(3, 3500)
    val ac4 = Account(4, 1400)
    val ac5 = Account(5, -1100)
    val ac6 = Account(6, -800)

    val Bank: List[Account] = List(ac1, ac2, ac3, ac4, ac5, ac6)

    println("Accounts(before apply interest): ")
    printBank(Bank)

    println(s"\nSum(before apply interest) = ${calcSum(Bank)}\n")

    val Bankafterinterest = applyInterest(Bank)
    println("Accounts(after apply interest): ")
    printBank(Bankafterinterest)

    println(s"\nSum(after apply interest) = ${calcSum(Bankafterinterest)}")

}

