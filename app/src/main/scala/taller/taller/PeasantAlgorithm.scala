/**
* Clase del algoritmo Peasant
*/
package  taller1
import scala.annotation.tailrec

class PeasantAlgorithm  {
  def multiply(a:Int, b:Int): Int = {
    @tailrec
    def multiplyAux(a:Int, b:Int, acc:Int):Int = {
      if (a == 0) {
        acc
      } else if (a % 2 == 0) {
        multiplyAux(a / 2, b + b, acc)
      } else {
        multiplyAux(a / 2, b + b, acc + b)
      }
    }

    multiplyAux(a, b, 0)
  }
}
