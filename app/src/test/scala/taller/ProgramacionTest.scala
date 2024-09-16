//  Se intenta crear un test para debuggear el código de la clase programacion 
// pero no me deja ejecutar.

package taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ProgramacionTest extends AnyFunSuite{
  val caso1 = new Programacion()
  
  test("Prueba de maximo en una lista") {
    assert(caso1.maxLin(List(1, 2, 3, 4, 5, 70,22,110,6, 7, 8, 9, 10)) == 110)
    assert(caso1.maxIt(List(3,1,6,2,9)) == 9)
    assert(caso1.maxIt(List(3,1,6,66,2,9,20)) == 66)
    assert(caso1.maxIt(List(3,7,2,5)) == 7)
  }
}
