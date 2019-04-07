package Chap3

import scala.collection.mutable
import scala.collection.mutable.HashSet

object C3_collections extends App {
  // arrays
  val arr1 = new Array[String](1.+(2))
  val arr2: Array[String] = new Array[String](3)
  val arr3: Array[String] = new Array(3)

  arr1(0) = "hi"
  for (i <- arr1.indices)
    println(arr1(i))

  // list
  val list = List(1, 2, 3)
  val listb = list ::: List("asf")
  list.count(i => i < 3)
  listb.foreach(println)
  var varl = 1 :: 2 :: 3 :: Nil
  varl ::: List(4, 5)
  println(varl.length)
  //  println(varl2.length)

  // tuple
  val p1 = (3, 3.4d)
  val p2 = (0, 5.6d)
  val ps = List(p1, p2, 0 -> 1.0d)
  ps.foreach(p => println(p._1 + "+" + p._2 + "i"))

  // set
  val jets = new HashSet[String]
  jets += "afs"

  val movieSet = Set("Hitch", "Poltergeist", "Shrek")
  // movieSet += "asdf"

  // map
  val treasureMap = new mutable.HashMap[Int, String]
  treasureMap += (1 -> "Go to island.")
  treasureMap += (2 -> "Find big X on ground.")
  treasureMap += (3 -> "Dig.")
  println(treasureMap(2))
}
