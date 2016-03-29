/*
ENUNCIADO:
Define en Scala	un procedimiento que simule una moneda que,	
cada vez que se	invoque, devuelva "cara" o "cruz"	
alternativamente. Cada x tiradas,	caera	de	"canto", y a la	
siguiente Prada volvera	a caer del lado que tocaba. El valor x se	
determinara	en	la	creación de	la moneda.	

var moneda=makeMoneda(5)		
moneda:()=>java.lang.String=<funcPon0>		
scala>moneda()	res29:java.lang.String=cara		
scala>moneda()	res30:java.lang.String=cruz		
scala>moneda()	res31:java.lang.String=cara		
scala>moneda()	res32:java.lang.String=cruz		
scala>moneda()	res33:java.lang.String=canto		
scala>moneda()	res34:java.lang.String=cara
*/

object ejercicio11 {
	def main(args: Array[String]): Unit = {

		var moneda = makeMoneda(3)
		println("Primera tirada ---> ", moneda())
		println("Segunda tirada ---> ", moneda())
		println("Tercera tirada ---> ", moneda())
		println("Cuarta tirada ---> ", moneda())
		println("Quinta tirada ---> ", moneda())
		println("Sexta tirada ---> ", moneda())
		println("Séptima tirada ---> ", moneda())

	  	
	}

	def makeMoneda(interval: Int): () => String = {
		var moneda = "cruz"
		var counter = 1
		() => {
			if (counter == interval){
				counter = 1
				moneda = "canto"
			} else {
				if (moneda == "cara"){
					counter += 1
					moneda = "cruz"
				} else {
					counter += 1
					moneda = "cara"
				}
			}
		moneda
		}
	}
}