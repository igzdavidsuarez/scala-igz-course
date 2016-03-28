/*
ENUNCIADO:
Función que devuelve el último de la lista.

Pista:last
*/

object ejercicio5 {
	def main(args: Array[String]): Unit = {
		
		val list = List("Primero", "Segundo", "Tercero", "Cuarto", "Ultimo")
		println(elUltimo(list))
	}

	// Using Generics to define the function
	def elUltimo[A](ls: List[A]): A = ls.last
}