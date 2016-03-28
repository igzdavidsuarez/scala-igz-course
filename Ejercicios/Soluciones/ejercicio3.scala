/*
ENUNCIADO:
Función que reciba como parámetro una lista y genere una cadena con todos los elementos de la
lista y que devuelva una cadena como salida por cada concatenación.

val sentence = List("happy", "christmas", "december", "25", "2016")
scala> concatenandoCadenas(sentence)
[a:start][b:happy]
[a:starthappy][b:christmas]
[a:starthappychristmas][b:december]
[a:starthappychristmasdecember][b:25]
[a:starthappychristmasdecember25][b:2016]

Pista: foldLeft
*/


object ejercicio3 {
	def main(args: Array[String]): Unit = {

		// Your code here
		val sentence = List("happy", "christmas", "december", "25", "2016")
		concatenandoCadenas(sentence)

	}

	def concatenandoCadenas(list: List[String]) : Unit = {
		list.foldLeft("start")((accum, x) => {
			println("[a: " + accum  + "]" + " " + "[b: " + x + "]")
			accum + x
		})
	}
}