object question2 {
  var (a,b,c,d) = (2,3,4,5)
  var k : Double = 4.3
  var g : Double = 4.0
  def main(args: Array[String]) : Unit = {
    //since postfix and prefix decrement are not supported in scala we have to manually do that
    b -= 1
    println("a) --b * a + c * d-- = " + (b * a + c * d))
    d -= 1

    //since postfix and prefix increment are not supported in scala we have to manually do that
    println("b) a++ = " + a)
    a += 1

    println("c) -2 * (g-k) + c = " + (-2 * (g-k) + c) )

    println("d) c = " + c)
    c += 1

    c += 1
    println("e) c = " + (c * a))
    a += 1

  }

  /*
    Both Java and Scala languages have Object Oriented Programming
    Scala has stronger support for functional programming than Java
    In Java the type of variables must be given but it is not a must in Scala
    Operator overloading is supported in Scala but not in Java
    Functions are objects in Java but in Scala they are variables
   */
}
