object question4 {
  def betterWay(currPrice: Double) : String = {
    val method1 = "Increase the price by Rs.5"
    val method2 = "Decrease the price by Rs.5"

    val profit1 = (100 * (currPrice + 5)) - (500 + (3 * 100))
    val profit2 = (140 * (currPrice - 5)) - (500 + (3 * 140))

    if(profit1 > profit2){
      method1
    }
    else{
      method2
    }
  }

  def main(args: Array[String]) : Unit = {
    println("The best way to make more profit is to " + betterWay(15))
  }
}
