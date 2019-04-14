package Chap8

import scala.io.Source

object FunctionClosure extends App {

  // a method
  def processFile(filename: String, width: Int) {
    val source = Source.fromFile(filename)
    for (line <- source.getLines) {
      processLine(line)
    }
    // nested function
    def processLine(line: String) {
      if (line.length > width) print(filename+": "+line)
    }
  }

  // first-class function
  val addOne = (x: Integer) => x + 1
  println(addOne(3))
  println(addOne(4))

  // closure
  var more = 1
  val addMore = (x: Integer) => x + more
  for(i <- 1 to 5)
    println(addMore(i))

  // varargu
  def echo(args: String*) = for (arg <- args) println(arg)
  val arr = Array("abc", "def")
  echo(arr: _*)
}
