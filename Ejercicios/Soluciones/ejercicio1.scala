/*
ENUNCIADO:
Función que imprime números del 1 al 12

*/

object ejercicio1 {
	def main(args: Array[String]): Unit = {

		//Option 1
	  	(1 to 12).foreach(x => {
	  		println(x)
	  	})

		//Option 2
	  	(1 to 12).foreach(println)
	}
}
