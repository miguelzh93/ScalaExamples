package co.com.ejemplos

object Main {
  def main(arg: Array[String]): Unit = {
    println("Prueba")
    println(Funciones.sumar(1,1))

    val f : (Int, Int) => Int = Funciones.sumar
    println(f(1,2))
    println(Funciones.sumarConFuncion(1,1, f ))

    val fnIncompleta = f(5,_)
    println("Ejemplo comodin par: ", fnIncompleta(10))

    println("Funcion compleja: ", Funciones.operacionCompleja(1,1)(1,2))

    val resultado = Funciones.sumarleUno(Funciones.toInts("1"))
    val resultado2 = Funciones.sumarleUno _ compose Funciones.toInts
    println("Composicion: ",resultado)
    println("Composicion2: ", resultado2("21"))

  }
}
