object question3 {
  def calcSalary( workHours:Int , OT: Int) : Double = {
    val salary = (((workHours * 250) + (OT * 85)) * 88 )/ 100
    salary
  }

  def main(args: Array[String]) : Unit ={
    println("The take home salary of the employee is Rs." + calcSalary(40,30))
  }
}
