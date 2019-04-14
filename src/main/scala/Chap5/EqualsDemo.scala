package Chap5

import java.util

object EqualsDemo extends App {
  val mutableList = new util.ArrayList[Int]()
  mutableList.add(1)
  mutableList.add(2)
  val immuList = List(1, 2)
  val immuList2 = List(1, 2)
  val list = 1::2::Nil
  println(null == null)
  println(Unit == Unit)
  println(null == Unit) // F
  println(immuList == mutableList) // F not same type
  println(immuList2 == immuList)
  println(list == immuList)
}
