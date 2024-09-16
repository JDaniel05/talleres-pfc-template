package taller.test_hanoi

import org.scalatest.funsuite.AnyFunSuite

class hanoi_Test1 extends AnyFunSuite {
  test("El número mínimo de movimientos para 1 disco debe ser 1") {
    assert(taller.torres_hanoi.movsTorresHanoi(1) == 1)
  }
}