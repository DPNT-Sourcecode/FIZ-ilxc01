package befaster.solutions.HLO

object Hello {
  def helloWorld(friendName: String): String = "Hello, World!"
  def helloFriend(friendName: String): String = s"Hello, $friendName!"
  val hello = helloFriend _
}
