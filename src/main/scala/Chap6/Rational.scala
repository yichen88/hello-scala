package Chap6

class Rational(n: Int, d: Int) {
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
  private val g = gcd(n, d)
  val numer: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n, 1)

  def add(that: Rational): Rational = new Rational(numer * that.denom + that.numer * denom,
    denom * that.denom)

  def sub(that: Rational): Rational =
    new Rational(numer * that.denom - that.numer * denom,
      denom * that.denom)

  def mul(that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)

  def div(that: Rational): Rational =
    new Rational(numer * that.denom, denom * that.numer)

  // overload operators
  def +(that: Rational): Rational =
    new Rational(numer * that.denom + that.numer * denom,
      denom * that.denom)

  def -(that: Rational): Rational =
    new Rational(numer * that.denom - that.numer * denom,
      denom * that.denom)

  def *(that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)

  def /(that: Rational): Rational =
    new Rational(numer * that.denom, denom * that.numer)

  // overload
  def +(that: Int): Rational = this + new Rational(that)

  def -(that: Int): Rational = this - new Rational(that)

  def *(that: Int): Rational = this * new Rational(that)

  def /(that: Int): Rational = this / new Rational(that)

  override def toString() = n + "/" + d

}

object Rational {
  implicit def intToRational(x: Int): Rational = new Rational(x)
}
