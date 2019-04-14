package Chap7

object ControlFlows extends App {
  println(if (false) "hi")
  println(if (true) "hi")
  val c: Unit = 3
  println(c)

  val filesHere = new java.io.File(".").listFiles
  val lines = for {
    file <- filesHere
    if file.toString.charAt(2) != '.'
    if file.isFile
    line <- scala.io.Source.fromFile(file).getLines
    if !line.isEmpty
  } yield line
  println(lines.getClass)


}
