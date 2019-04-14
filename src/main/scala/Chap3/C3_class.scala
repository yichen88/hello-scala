package Chap3

object C3_class extends App {
  val f = new Foo("hi")
  f.hi()
}
class Foo(foo: String, times: Int) {
  if (foo == null)
    throw new NullPointerException()

  def hi() = println(foo)

  def this(foo: String) = this(foo, 1)
}
