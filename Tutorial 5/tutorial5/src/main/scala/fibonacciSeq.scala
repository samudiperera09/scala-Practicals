object fibonacciSeq {
  def fibonacci(n: Int): List[Int] = {
    if (n <= 0) {
      List()
    } else if (n == 1) {
      List(0)
    } else if (n == 2) {
      List(0, 1)
    } else {
      val fiboList = fibonacci(n - 1)
      fiboList :+ (fiboList(n - 2) + fiboList(n - 3))
    }
  }


  def main(args : Array[String]) : Unit = {
    val fiboSequence = fibonacci(10)
    println(fiboSequence.mkString(", "))
  }

}
