object printSum {
  def sum(n: Int): Int = {
    if (n <= 1) {
      n
    }
    else {
      n + sum(n - 1)
    }
  }

  def main(args:Array[String]): Unit = {
    println(sum(5))
  }

}
