package befaster.solutions.FIZ

import org.scalatest.{FlatSpec, Matchers}

class FizzTest  extends FlatSpec with Matchers {
  it should "return 7 (fizzBuzz1)" in {
    FizzBuzz.fizzBuzz1(7) shouldBe "7"
  }

  it should "return fizz (fizzBuzz1)" in {
    FizzBuzz.fizzBuzz1(6) shouldBe "fizz"
  }

  it should "return buzz (fizzBuzz1)" in {
    FizzBuzz.fizzBuzz1(10) shouldBe "buzz"
  }

  it should "return fizz buzz (fizzBuzz1)" in {
    FizzBuzz.fizzBuzz1(15) shouldBe "fizz buzz"
  }

  it should "return 7 (fizzBuzz2)" in {
    FizzBuzz.fizzBuzz2(7) shouldBe "7"
  }

  it should "return fizz (fizzBuzz2 div by 3)" in {
    FizzBuzz.fizzBuzz2(6) shouldBe "fizz"
  }

  it should "return fizz (fizzBuzz2 3 in number)" in {
    FizzBuzz.fizzBuzz2(13) shouldBe "fizz"
  }

  it should "return buzz (fizzBuzz2 div by 5)" in {
    FizzBuzz.fizzBuzz2(10) shouldBe "buzz"
  }

  it should "return buzz (fizzBuzz2 5 in number)" in {
    FizzBuzz.fizzBuzz2(52) shouldBe "buzz"
  }

  it should "return fizz buzz (fizzBuzz2 div by 3 and by 5)" in {
    FizzBuzz.fizzBuzz2(15) shouldBe "fizz buzz"
  }

  it should "return fizz buzz (fizzBuzz2 3 and 5 in number)" in { //number is not div by 5, not div by 3 but has a 3 and a 5 in it
    FizzBuzz.fizzBuzz2(53) shouldBe "fizz buzz"
  }

  it should "return fizz buzz (fizzBuzz2 div by 5 and 3 in number)" in {   //number is div by 5, not div by 3 but has a 3 in it
    FizzBuzz.fizzBuzz2(35) shouldBe "fizz buzz"
  }

  it should "return fizz buzz (fizzBuzz2 div by 3 and 5 in number)" in {   //number is div by 3, not div by 5 and has a 5 in it
    FizzBuzz.fizzBuzz2(153) shouldBe "fizz buzz"
  }

  it should "return 7 (fizzBuzz3)" in {
    FizzBuzz.fizzBuzz3(7) shouldBe "7"
  }

  it should "return deluxe" in {
    FizzBuzz.fizzBuzz3(11) shouldBe "deluxe"
  }

  it should "return fizz deluxe" in {
    FizzBuzz.fizzBuzz3(33) shouldBe "fizz deluxe"
  }

  it should "return buzz deluxe" in {
    FizzBuzz.fizzBuzz3(55) shouldBe "buzz deluxe"
  }

  it should "return fizz buzz deluxe" in {
    FizzBuzz.fizzBuzz3(555) shouldBe "fizz buzz deluxe"
  }

}

