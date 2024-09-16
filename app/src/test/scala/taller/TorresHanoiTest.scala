package taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TorresHanoi extends AnyFunSuite{
  val caso3 = new TorresHanoi()
  
  test("Prueba de movimientos de las torres de Hanoi") {
    assert(caso3.movsTorresHanoi(1) == 1)
    assert(caso3.movsTorresHanoi(2) == 3)
    assert(caso3.movsTorresHanoi(3) == 7)
    assert(caso3.movsTorresHanoi(4) == 15)
    assert(caso3.movsTorresHanoi(5) == 31)
  }

  test("Prueba de torres de Hanoi con las torres") {
    assert(caso3.torresHanoi(1,1,2,3) == List((1,3)))
    assert(caso3.torresHanoi(2,1,2,3) == List((1,2), (1,3), (2,3)))
    assert(caso3.torresHanoi(3,1,2,3) == List((1,3), (1,2), (3,2), (1,3), (2,1), (2,3), (1,3)))
    assert(caso3.torresHanoi(4,1,2,3) == List((1,2), (1,3), (2,3), (1,2), (3,1), (3,2), (1,2), (1,3), (2,3), (2,1), (3,1), (2,3), (1,2), (1,3), (2,3)))
    assert(caso3.torresHanoi(5,1,2,3) == List((1,3), (1,2), (3,2), (1,3), (2,1), (2,3), (1,3), (1,2), (3,2), (3,1), (2,1), (3,2), (1,3), (1,2), (3,2), (1,3), (2,1), (2,3), (1,3), (2,3), (1,2), (3,2), (1,3), (2,1), (2,3), (1,3)))
}
}
