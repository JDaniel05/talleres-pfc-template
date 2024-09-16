/**
* Clase del algoritmo Fast
*/
package  taller1
import scala.annotation.tailrec

class FastAlgorithm  {
  def multiply(a:Int, b:Int): Int = {
    
    def multiplyAux(a:Int, b:Int, acc:Int):Int = {
      if (a < 10 || b < 10) {
        a * b + acc
      } else {
        val m = math.min(math.log10(a).toInt, math.log10(b).toInt) / 2 + 1
        val p = math.pow(10, m).toInt
        val x = a / p
        val y = a % p
        val z = b / p
        val w = b % p
        val ac = multiplyAux(x, z, 0)
        val bd = multiplyAux(y, w, 0)
        val ad_bc = multiplyAux(x - y, z - w, 0)
        ac * p * p + (ac + bd - ad_bc) * p + bd + acc
      }
    }
    0 //Cambiar

    multiplyAux(a, b, 0)
  }

}
