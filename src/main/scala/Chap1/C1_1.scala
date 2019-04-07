package Chap1

object C1_1 extends App {

  print(facto(13))

  def facto(x: BigInt): BigInt = {
    if (x == 1)
      1
    else
      x * facto(x - 1)
  }

}
