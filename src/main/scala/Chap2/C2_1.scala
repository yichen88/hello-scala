package Chap2

object C2_1 extends App {
  // val vs var
  val str = "final"
  //str = "change"
  var v = "variable"
  v = "change"

  // base
  def foo(x: Int, y : Int) : Int = {
    42
  }

  // non-recursive method, return type can be omitted
  def nonRecursive(x:Int) {
    x + 1
  }
  // unit <- void
  def nonReturn() : Unit = {
    println("unit is void")
  }
  nonReturn()
  // calling function should with parentheses
  nonReturn // side effect

  // non-args
  def nonArgs : Int = {
    42
  }
  // print(nonArgs())
  print(nonArgs)

  // val vs def
  def greet = "hi"
  println(greet)

  //not enough arguments for method apply: (index: Int)Char in class StringOps.
  //Unspecified value parameter index.
  //  println(greet())

}
