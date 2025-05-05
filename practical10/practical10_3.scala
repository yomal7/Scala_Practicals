@main def practical10_3(): Unit = {
    case class Account(val id: Int, var amount: Double){

        def deposit(depositAmount: Double) = {
            val value = this.amount
            this.amount = value + depositAmount
        } 

        def currentBalance(): Unit = println(s"account id: $id\ncurrent balance: $amount")

        def withdraw(withdrawAmount: Double) = {
            if(withdrawAmount > this.amount){
                println("can not withdraw this amount.")
            }
            else{
                val value = this.amount
                this.amount = value - withdrawAmount
            }
        }

        def transfer(transferAmount: Double, that: Account) = {
            if(transferAmount > this.amount){
                println("can not transfer this amount.")
            }
            else{
                val value1 = this.amount
                val value2 = that.amount

                this.amount = value1 - transferAmount
                that.amount = value2 + transferAmount
            }
        }
    }

    val ac1 = Account(1, 2000)
    println("before deposit: ")
    ac1.currentBalance()

    ac1.deposit(3000)

    println("\nafter deposit: ")
    ac1.currentBalance()

    ac1.withdraw(500)

    println("\nafter withdraw: ")
    ac1.currentBalance()

    val ac2 = Account(2, 3000)

    ac1.transfer(2500, ac2)
    
    println("\nafter transfer: ")
    ac1.currentBalance()
    ac2.currentBalance()
}