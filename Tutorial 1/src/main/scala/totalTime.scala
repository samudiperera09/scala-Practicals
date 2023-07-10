object totalTime {
  def tot_time(easyDis: Double, tempoDis: Double): Double = {
    val total = (easyDis * 8) + (tempoDis * 7)
    total
  }

  def main(args: Array[String]): Unit = {
    println("The time taken to travel is " + tot_time(4,3) + " minutes")
  }
}
