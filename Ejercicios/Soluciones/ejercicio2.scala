/*
ENUNCIADO:
Función que imprime números impares del 1 al 100

Pista: filter y foreach
*/

object ejercicio2 {
  def main(args: Array[String]): Unit = {

    // Your code here
    number_odd()
    number_odds_unit()
    number_odd_generator()
  }

  def number_odd_generator(): Unit = for (n <- 1 to 100 if n % 2 == 1) println(n)

  def number_odd(): Unit = (1 to 100).filter(_ % 2 == 1).foreach(n => println(n))

  def number_odds_unit(): Unit = (1 to 100).filter(_ % 2 == 1).foreach(println)
}