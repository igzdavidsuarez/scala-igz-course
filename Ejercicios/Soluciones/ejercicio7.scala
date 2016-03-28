/*
ENUNCIADO:
Función de Fibonacci
Encuentra los primer N elementos de la secuencia de Fibonnaci.
*/

object ejercicio7 {
	def main(args: Array[String]): Unit = {

		//Option 1: Recursive
		val list = getFibonacciListRecursive(7)
		list.foreach(println)

		//Option 2: Iterative
		val list2 = getFibonacciListIterative(7)
		list2.foreach(println)
	  	
	}

	// Recursive
	def getFibonacciListRecursive(n: Int) : List[Int] = {

		List.range(0, n).map(x => getFibonacciNumberRecursive(x))
	}

	def getFibonacciNumberRecursive(n: Int) : Int = {
		n match {
			case a if a < 2 => a
			case a => getFibonacciNumberRecursive(n - 1) + getFibonacciNumberRecursive(n - 2)
		}
	}


	// Iterative

		def getFibonacciListIterative(n: Int) : List[Int] = {

		List.range(0, n).map(x => getFibonacciNumberIterative(x))
	}

	def getFibonacciNumberIterative(n: Int) : Int = {
		var i = 1
		var j = 0
		for(a <- 0 to n-1) {
			val t = i + j
			j = i
			i = t
		}
		j
	}

}