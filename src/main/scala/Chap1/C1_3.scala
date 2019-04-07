package Chap1

object C1_3 extends App {
  var str: String = "3"
  println(str.toInt + 3)
  var name = "asdfG"
  var b1 = name.exists(_.isUpper)
  var b2 = !name.toLowerCase.equals(name)
}
