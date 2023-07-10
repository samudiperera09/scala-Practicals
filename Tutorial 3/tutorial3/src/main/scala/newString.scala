object newString {
  def filterStrings(list: List[String]): List[String] = {
    list.filter(_.length > 5)
  }

  def main(args:Array[String]) : Unit ={
    val list = List("Hello", "World", "Scala", "University", "Computer")
    val filtered = filterStrings(list)
    println("The list of strings that have a length greater than 5 is " + filtered)
  }


}
