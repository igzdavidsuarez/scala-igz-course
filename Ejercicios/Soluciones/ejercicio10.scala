/*
ENUNCIADO:
<<<<<<< Updated upstream
Implementa en	Scala	un programa que permita construir
parkímetros utilizando estado	local	(al	estilo del ejemplo del
contador con estado	y	mensajes). La	clausura devuelta tendrá el
perfil (String, Double) => Double, siendo	el String	el mensaje que
especifica la acción a hacer por el parkímetro,	el Double	el
parámetro necesario	en algún mensaje. En el caso que no
necesite el	parámetro, se	pasará un	valor	por defecto como 0.0.
Mensajes y acciones	a	realizar:
●	"pagar": se	añade dinero al	parkímetro.	Cuesta 0.01	euros/minuto.
●	"Tiempo": paraconsultar el	tiempo que le queda
●	"total": para	saber	cuánto dinero	ha recogido	un determinado parkimetro. ● "tick":	El tiempo
se decrementa manualmente simulando	el tick	de reloj.
=======
Implementa	en	Scala	un	programa que permita construir
parkímetros utilizando estado	local	(al	estilo	del	ejemplo	del	
contador	con	estado	y	mensajes).	La	clausura devuelta tendra	el	
perfil	(String,Double)=>Double,	siendo	el	String	el	mensaje que
especifica	la	acción	a	hacer por	el	parkímetro,	el	Double	el	
parámetro necesario	en	algún mensaje.	En	el	caso que	no	
necesite	el	parámetro,	se	pasara	un	valor	por defecto como	0.0.	
Mensajes	y	acciones	a	realizar:	
●	"pagar":	se	añade dinero	al	parkímetro.	Cuesta	0.01	euros/minuto.	
●	"tiempo":	paraconsultar	el	tiempo que	le	queda
●	"total":	para	saber	cuánto dinero	ha	recogido	un	determinado parkimetro.
●	"tick":	El	tiempo se	decrementa manualmente simulando	el	tick	de	reloj.
>>>>>>> Stashed changes
*/


object ejercicio10 {
  def main(args: Array[String]): Unit = {

    // Function
    println(makeParkimetro()("pagar", 100))
    println(makeParkimetro()("tiempo", 100))
    println(makeParkimetro()("total", 100))
    println(makeParkimetro()("tick", 100))

	// Case Classes
	val park = parquimetro(5, 10)
	park.enviarAccion("tiempo", 0.0)
	park.enviarAccion("total", 0.0)
	park.enviarAccion("pagar", 20)
	park.enviarAccion("tiempo", 0.0)
	park.enviarAccion("total", 0.0)
	park.enviarAccion("pagar", 20)
	park.enviarAccion("tiempo", 0.0)
	park.enviarAccion("total", 0.0)
	park.enviarAccion("tick", 0.0)
	park.enviarAccion("tick", 0.0)
	park.enviarAccion("tick", 0.0)
	park.enviarAccion("tiempo", 0.0)
	park.enviarAccion("total", 0.0)
  }

	def makeParkimetro(): (String, Double) => Double = {
		var dineroAcc: Double = 0
		var tiempo: Double = 0
		(accion: String, cantidad: Double) => {
		  accion match {
		    case "pagar" => {
		      tiempo += cantidad / 0.01
		      dineroAcc += cantidad
		      tiempo
		    }
		    case "tiempo" => tiempo
		    case "total" => dineroAcc
		    case "tick" => {
		      if (tiempo > 0) {
		        tiempo = tiempo - 1
		      }
		      tiempo
		    }
		  }
		}
	}

	case class parquimetro(var time: Double, var total: Double) {
		def enviarAccion(accion: String, cantidad: Double): Unit = {
			accion match {
				case "pagar" => pagarParquimetro(cantidad)
				case "tiempo" => consultaTiempo()
				case "total" => consultarDinero()
				case "tick" => decrementarTiempo()
				case _ => 
			}
		}

		def pagarParquimetro(cantidad: Double): Unit = {
			time = time + (cantidad/0.01 * 60)
		}

		def consultaTiempo(): Unit = {
			println("Time remaining: " + time)
		}

		def consultarDinero(): Unit = {
			println("Cash accumulated: " + total)
		}

		def decrementarTiempo(): Unit = {
			time = time - 1
			total = total + 0.01/60
		}
	}
}
