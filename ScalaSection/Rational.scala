package week3

object Rational {
  val x = new Rational(1, 3) //> x  : week2.Rational = 1/3
  x.numer //> res0: Int = 1
  x.denom //> res1: Int = 3

  val y = new Rational(5, 7) //> y  : week2.Rational = 5/7
  val z = new Rational(3, 2) //> z  : week2.Rational = 3/2
  val a = new Rational(5) //> a  : week3.Rational = 5/1
  x + y //> res2: week2.Rational = 22/21
  x - y - z //> res3: week2.Rational = -79/42
  y + y //> res4: week2.Rational = 10/7
  x < y //> res5: Boolean = true
  y max z //> res6: week3.Rational = 3/2
  val b = new Rational(2, -66)                    //> b  : week3.Rational = -1/33
  val c = new Rational(-2, -9)                    //> c  : week3.Rational = 2/9
  -c                                              //> res7: week3.Rational = -2/9
}

class Rational(x: Int, y: Int) {
  require(y != 0, "denominator must be nonzero")
  
  def this(x: Int) = this(x, 1)
  
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(x, y)

  def numer = x / g
  def denom = y / g

  def <(r: Rational) = numer * r.denom < r.numer * denom

  def max(that: Rational) = if (this < (that)) that else this

  def +(r: Rational) =
    new Rational(numer * r.denom + r.numer * denom, denom * r.denom)

  def unary_- : Rational = new Rational(-numer, denom)

  def -(r: Rational) = this + -r

  override def toString =
    if (denom < 0 && numer >= 0) -numer + "/" + -denom
    else numer + "/" + denom
}
