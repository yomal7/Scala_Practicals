@main def practical2_3(): Unit = {
    val NomalRate : Int = 250
    val OTRate : Int = 85

    def Wage(NomalHours: Int): Int = NomalHours*NomalRate

    def OT(OTHours: Int): Int = OTHours*OTRate

    def CalSalary(NomalHours: Int , OTHours: Int): Int = Wage(NomalHours) + OT(OTHours)

    def CalTax(Salary: Int): Double = Salary* 0.12

    def TakeHomeSalary (NomalHours: Int , OTHours: Int) = CalSalary(NomalHours, OTHours) - CalTax(CalSalary(NomalHours, OTHours))

    println(s"Take Home Salary = ${TakeHomeSalary(40,30)}")

}
