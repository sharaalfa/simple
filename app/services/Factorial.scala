package services

trait Factorial {
  def factorial(n: Int): Long
}

class NewFactorial extends Factorial {
  override def factorial(n: Int): Long =
    if (n == 0) 1
    else n * factorial(n - 1)
}