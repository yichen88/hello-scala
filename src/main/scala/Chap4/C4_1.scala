package Chap4

object C4_1 extends App {
  class Foo(name : String) {
    var i = 0
    def getName() = {
      name
    }

    def add:Unit = {
      i += 1
    }
  }

  var f1 = new Foo("1")
  var f2 = f1
  f1 = new Foo("2")
  println(f2.getName())
  println(f1.add)
  println(g)
  println(Unit)
  def g {
    "hi"
  }
}
