object reverseString {
  def reverse(str: String): String = {
    if (str.isEmpty)
      ""
    else
      reverse(str.tail) + str.head
  }

  def main(args:Array[String]) : Unit ={
    val str = "Hello, World!"
    val reversed = reverse(str)
    println("The reversed string of "  + str + " is " + reversed)
  }
}
