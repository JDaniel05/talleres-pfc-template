package taller.test_hanoi

import org.scalatest.funsuite.AnyFunSuite

class hanoi_Test4 extends AnyFunSuite {
  test("La secuencia de movimientos para 3 discos debe ser correcta") {
    val movimientosEsperados = List(
      (1, 3), (1, 2), (3, 2),
      (1, 3), (2, 1), (2, 3), (1, 3)
    )
    assert(taller.torres_hanoi.torresHanoi(3, 1, 2, 3) == movimientosEsperados)
  }
}