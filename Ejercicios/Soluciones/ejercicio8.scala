/*
ENUNCIADO:
Factorial
Calcula el factorial de un número.

Pista: recursividad
*/

object ejercicio8 {
  def main(args: Array[String]): Unit = {

    // Your code here
    println(factorial(5))
    println(factorial_returns(5))
    println(factorial_match(5))
  }

  def factorial_returns(n: Int): Int = {
    if (n == 0) return 1
    else return n * factorial_returns(n - 1)
  }

  def factorial(n: Int): Int = if (n == 0) 1 else n * factorial(n - 1)

  def factorial_match(n: Int): Int = n match {
    case 0 => 1
    case _ => n * factorial_match(n - 1)
  }
}