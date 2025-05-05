def displayInventory(name: Array[String], quantity: Array[Int]): Unit ={
    println("current inventory ")
    name.zip(quantity).foreach{case (name, quantity) => println(s"$name : $quantity")}
    println()
}

def restockItem(name: Array[String], quantity: Array[Int], itemName: String, amount: Int): Array[Int] = {
  name.indexOf(itemName) match {
    case -1 => 
      println(s"Error: $itemName not found in inventory.")
      quantity
    case index =>
      val newQuantities = quantity.clone()
      newQuantities(index) += amount
      println(s"Restocked $amount $itemName s. New quantity: ${newQuantities(index)}")
      newQuantities
  }
}

def sellItem(name: Array[String], quantity: Array[Int], itemName: String, sellAmount: Int): Array[Int] = {
  name.indexOf(itemName) match {
    case -1 => 
      println(s"Error: $itemName not found in inventory.")
      quantity
    case index if quantity(index) >= sellAmount =>
      val newQuantities = quantity.clone()
      newQuantities(index) -= sellAmount
      println(s"Sell $sellAmount $itemName s. New quantity: ${newQuantities(index)}")
      newQuantities
    case index =>
        println(s"Error : Not enough quantity for ${name(index)}")
        quantity
  }
}

@main def practical4_1(): Unit = {
    val name = Array("Biscuit", "Chocolate", "Milk", "Banana", "Cake")
    var quantity = Array(50, 70, 35, 20, 45)

    displayInventory(name, quantity)
    quantity = restockItem(name, quantity, "Banana", 10)
    displayInventory(name, quantity)

    quantity = sellItem(name, quantity, "Chocolate", 35)
    displayInventory(name, quantity)
    quantity = sellItem(name, quantity, "Milk", 40)
    displayInventory(name, quantity)

}