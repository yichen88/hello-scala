package Chap3

object C3_trait extends App {
  val p1: Friendly = new Person("as") with MoreFriendly
  p1.greet()
  val dog: Friendly = new Dog
  val hd: Dog = new HungryDog with MoreFriendly
  val list = p1 :: dog :: hd :: Nil
  list.foreach(f => println(f.greet()))
}


trait Friendly {
  def greet() = "hi"
}

trait MoreFriendly extends Friendly {
  override def greet(): String = super.greet() + "!"
  def anotherGreet() : String = "hello"
}

class Person(name: String) extends Friendly {

}

class Dog extends Friendly {
  override def greet(): String = "woof"
}

class HungryDog extends Dog {
  override def greet(): String = "in HungryDog greet"
}
