package befaster.solutions.HLO

import org.scalatest.{FlatSpec, Matchers}

class HelloTest extends FlatSpec with Matchers {
  it should "return a hello World message" in {
    Hello.helloWorld("stranger") shouldBe "Hello, World!"
  }
  it should "return a hello friend message" in {
    Hello.helloFriend("stranger") shouldBe "Hello, stranger!"
  }

  it should "return same as hello friend message" in {
    Hello.hello("stranger") shouldBe "Hello, stranger!"
  }

}
