object calculateMean {

  def calcMean(num1: Int, num2: Int): Float = {
    val sum = num1 + num2
    val average = sum.toFloat / 2

    average
  }

  def main(args:Array[String]) : Unit = {
    val num1 = 18
    val num2 = 5
    val average = calcMean(num1, num2)
    printf("The average of the two numbers is : %.2f " , average)
  }


}
