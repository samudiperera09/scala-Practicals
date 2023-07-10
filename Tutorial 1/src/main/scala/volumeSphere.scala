object volumeSphere {
  def volume(radius: Double): Double = (4 * 3.14 * radius * radius * radius)/3

  def main(args: Array[String]): Unit = {
    val vol_sphere = volume(5)
    println("The volume of the sphere is " + vol_sphere)
  }
}
