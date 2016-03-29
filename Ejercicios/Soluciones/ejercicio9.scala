/*
ENUNCIADO:
Implementa	en	Scala	un	contador uPlizando estado	local	
(variable	local)	que,	cada vez que	se	invoque,	devuelva	el	
resultado	de	aplicar una función	al	valor	del	resultado obtenido
la	vez	anterior.	Tanto	la	función	a	aplicar como	el	valor	de	inicio
se	determinan	en	el	momento	de	la	creación	del	contador.

Ejemplo:	
def cuadrado(x:Int)=x*x	
val cont=makeContador(2,cuadrado	_)	
cont()→	4	
cont()→	16
*/

object ejercicio9 {
	def main(args: Array[String]): Unit = {

		def cuadrado(x:Int)=x*x
		val cont = makeContador(2, cuadrado)
		println(cont()) // 4
		println(cont()) // 16
		println(cont()) // 256
	  	
	}

	def makeContador(cont: Int, fn: (Int) => Int): () => Int = {
		var last = cont
		() => {
			last = fn(last)
		last
		}
	}
}