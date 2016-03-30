/*
ENUNCIADO:
Función que reciba como parámetro un String y limpie las etiquetas: < >

Pista: replaceAll
*/

object ejercicio4 {
  def main(args: Array[String]): Unit = {

    // Your code here
    var cadena = "<html><head><title>Mi titulo</title></head><body class=\"container\">Mi web.</body></html>"
    println(cleaningHTML(cadena))
  }

  def cleaningHTML(html: String): String = html.replaceAll("<[^>]*>", ",")
}