/**
* Clase del algoritmo Split 
*/
package taller1
import scala.annotation.tailrec

class SplitAlgorithm  {
  def multiply(a:Int, b:Int): Int = {
    @tailrec
    def multiplyAux(a:Int, b:Int, acc:Int):Int = {
      if (a == 0) {
        acc
      } else {
        val digit = a % 10
        val rest = a / 10
        val newAcc = acc + (b * digit)
        multiplyAux(rest, b * 10, newAcc)
      }
    }

    multiplyAux(a, b, 0)
  }
}
