package taller.test_hanoi

import org.scalatest.funsuite.AnyFunSuite

class hanoi_Test2 extends AnyFunSuite {
  test("El número mínimo de movimientos para 4 discos debe ser 15") {
    assert(taller.torres_hanoi.movsTorresHanoi(4) == 15)
  }
}