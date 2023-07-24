import scala.io.StdIn
object caesarCipher {
  def encrypt(str : String, key : Int ): String = {
    str.map { char =>
      if(char.isLetter){
        val start = if (char.isUpper) 'A' else 'a'
        ((char - start + key) % 26 + start).toChar
      }
      else{
        char
      }
    }
  }
  def decrypt(str : String, key : Int) : String = {
    encrypt(str , (26 - key))
  }

  def cipher(str: String, key: Int, operation: (String,Int) => String): String = {
    operation(str,key)
  }

  def main(args : Array[String]) : Unit = {
    print("Enter the string ")
    val str = StdIn.readLine()
    print("Enter the key ")
    val key = StdIn.readInt()

    print("If you want to encrypt, enter 1 and if you want to decrypt, enter 2 ")
    val doCase = StdIn.readInt()

    if(doCase == 1){
      println("The encrypted text is " + cipher(str,key,encrypt))
    }
    else if(doCase == 2){
      println("The decrypted text is " + cipher(str,key,decrypt))
    }
    else{
      println("Please enter 1 or 2")
    }
  }

}
