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
    val str = "Caesar"
    val key = 1

    val encryptedStr = cipher(str,key,encrypt)
    val decryptedStr = cipher(encryptedStr, key, decrypt)

    println("Original Text: " + str)
    println("Encrypted Text: " + encryptedStr)
    println("Decrypted Text: " + decryptedStr)
  }

}
