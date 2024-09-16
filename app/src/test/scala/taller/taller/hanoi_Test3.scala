package taller.test_hanoi

import org.scalatest.funsuite.AnyFunSuite

class hanoi_Test3 extends AnyFunSuite {
  test("La secuencia de movimientos para 2 discos debe ser correcta") {
    val movimientosEsperados = List((1, 2), (1, 3), (2, 3))
    assert(taller.torres_hanoi.torresHanoi(2, 1, 2, 3) == movimientosEsperados)
  }
}