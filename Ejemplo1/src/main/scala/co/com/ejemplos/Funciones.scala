package co.com.ejemplos

object Funciones {
  def sumar(a: Int, b: Int): Int = a + b

  def sumarConFuncion(a: Int, b: Int, f : (Int, Int) => Int): Int = {
    a + b + f(1,2)
  }

  def operacionCompleja(a: Int, b: Int)(c: Int, d: Int) = {
    a + b+ c + d
  }

  def toInts(cadena: String) = cadena.toInt

  def sumarleUno(numero: Int) =  numero + 1


}
