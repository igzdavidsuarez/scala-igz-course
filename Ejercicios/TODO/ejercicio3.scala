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