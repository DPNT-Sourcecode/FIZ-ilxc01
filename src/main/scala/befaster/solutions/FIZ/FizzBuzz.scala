package befaster.solutions.FIZ

object FizzBuzz {
  def fizzBuzz1(number: Int): String = {
    val divBy3 = number % 3
    val divBy5 = number % 5

    if (divBy3 == 0 && divBy5 == 0)
      "fizz buzz"
    else if (divBy3 == 0)
      "fizz"
    else if (divBy5 == 0)
      "buzz"
    else
      number.toString
  }

  def fizzBuzz2(number: Int): String = {
    val divBy3 = number % 3
    val divBy5 = number % 5

    val numStr = number.toString
    val hasA3 = numStr.contains('3')
    val hasA5 = numStr.contains('5')

    if ( (divBy3 == 0 || hasA3) && (divBy5 == 0 || hasA5))
     "fizz buzz"
    else if (divBy3 == 0 || hasA3)
      "fizz"
    else if (divBy5 == 0 || hasA5)
      "buzz"
    else
      numStr
  }

  def fizzBuzz3(number: Int): String = {
    def sameChar(remainStr: String): Boolean = {
      if (remainStr.length == 1) true
      else if (remainStr.charAt(0) == remainStr.charAt(1)) sameChar(remainStr.substring(1))
      else false
    }

    val fb = fizzBuzz2(number)
    val numStr = number.toString
    val areCharsTheSame = sameChar(numStr) && numStr.length > 1

    if (areCharsTheSame && fb != numStr)
      s"$fb deluxe"
    else if (areCharsTheSame && fb == numStr)
      "deluxe"
    else
      fb
  }

  val fizzBuzz = fizzBuzz3 _


}

