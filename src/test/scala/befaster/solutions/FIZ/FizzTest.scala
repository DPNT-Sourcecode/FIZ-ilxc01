package befaster.solutions.FIZ

import org.scalatest.{Matchers, WordSpec}

class FizzTest extends WordSpec with Matchers {

  it when {
    "performing fizzBuzz1" should {
      "return 7" in {
        FizzBuzz.fizzBuzz1(7) shouldBe "7"
      }

      "return fizz (fizzBuzz1)" in {
        FizzBuzz.fizzBuzz1(6) shouldBe "fizz"
      }

      "return buzz (fizzBuzz1)" in {
        FizzBuzz.fizzBuzz1(10) shouldBe "buzz"
      }

      "return fizz buzz (fizzBuzz1)" in {
        FizzBuzz.fizzBuzz1(15) shouldBe "fizz buzz"
      }
    }

    "performing fizzBuzz2" should {
      "return 7" in {
        FizzBuzz.fizzBuzz2(7) shouldBe "7"
      }

      "return fizz (div by 3)" in {
        FizzBuzz.fizzBuzz2(6) shouldBe "fizz"
      }

      "return fizz (3 in number)" in {
        FizzBuzz.fizzBuzz2(13) shouldBe "fizz"
      }

      "return buzz (div by 5)" in {
        FizzBuzz.fizzBuzz2(10) shouldBe "buzz"
      }

      "return buzz (5 in number)" in {
        FizzBuzz.fizzBuzz2(52) shouldBe "buzz"
      }

      "return fizz buzz (div by 3 and by 5)" in {
        FizzBuzz.fizzBuzz2(15) shouldBe "fizz buzz"
      }

      "return fizz buzz (3 and 5 in number)" in { //number is not div by 5, not div by 3 but has a 3 and a 5 in it
        FizzBuzz.fizzBuzz2(53) shouldBe "fizz buzz"
      }

      "return fizz buzz (div by 5 and 3 in number)" in {   //number is div by 5, not div by 3 but has a 3 in it
        FizzBuzz.fizzBuzz2(35) shouldBe "fizz buzz"
      }

      "return fizz buzz (div by 3 and 5 in number)" in {   //number is div by 3, not div by 5 and has a 5 in it
        FizzBuzz.fizzBuzz2(153) shouldBe "fizz buzz"
      }
    }

    "performing fizzBuzz3" should {
      "return 7" in {
        FizzBuzz.fizzBuzz3(7) shouldBe "7"
      }

      "return deluxe" in {
        FizzBuzz.fizzBuzz3(11) shouldBe "deluxe"
      }

      "return fizz deluxe" in {
        FizzBuzz.fizzBuzz3(33) shouldBe "fizz deluxe"
      }

      "return buzz deluxe" in {
        FizzBuzz.fizzBuzz3(55) shouldBe "buzz deluxe"
      }

      "return fizz buzz deluxe" in {
        FizzBuzz.fizzBuzz3(555) shouldBe "fizz buzz deluxe"
      }

    }

    "performing fizzBuzz4" should {
      "return fake deluxe" in {
        FizzBuzz.fizzBuzz4(11) shouldBe "fake deluxe"
      }

      "return fizz fake deluxe" in {
        FizzBuzz.fizzBuzz4(33) shouldBe "fizz deluxe"
      }

      "return buzz fake deluxe" in {
        FizzBuzz.fizzBuzz4(55) shouldBe "buzz deluxe"
      }

      "return fizz buzz fake deluxe" in {
        FizzBuzz.fizzBuzz4(555) shouldBe "fizz buzz deluxe"
      }
    }
  }










}

