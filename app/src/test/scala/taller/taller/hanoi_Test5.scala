package taller.test_hanoi

import org.scalatest.funsuite.AnyFunSuite

class hanoi_Test5 extends AnyFunSuite {
  test("Para 0 discos no debe haber movimientos") {
    assert(taller.torres_hanoi.torresHanoi(0, 1, 2, 3) == List())
  }
}