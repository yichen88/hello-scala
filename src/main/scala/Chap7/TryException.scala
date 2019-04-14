package Chap7

object TryException extends App {
  def f(): Int = try { 1 } finally { return 2 }
  def g(): Int = try { 1 } finally { 2 }
  println(f())
  println(g())
}
