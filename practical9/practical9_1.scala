val calcInterest = (depositAmount: Int) => {
    depositAmount match {
    case amount if amount <= 20000 => amount * 0.02
    case amount if amount <= 200000 => amount * 0.04
    case amount if amount <= 2000000 => amount * 0.035
    case amount => amount * 0.065
  }
}

@main def practical9_1(): Unit = {
  println(f"The interest for 150000 deposit amount = ${calcInterest(150000)}%.2f")
}

