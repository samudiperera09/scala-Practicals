object calculateDiskArea {
  def calc_area(radius: Double): Double = 3.14 * radius * radius

  def main(args: Array[String]): Unit = {
    val area = calc_area(5)
    println("The area of the disk with radius is " + area)
  }
}


