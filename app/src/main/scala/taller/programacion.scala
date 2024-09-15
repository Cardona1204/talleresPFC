package taller
import scala.annotation.tailrec

class programacion {
  def maxLin(lst: List[Int]): Int = {
    if(lst.isEmpty) 0
    else if(lst.head > maxLin(lst.tail)) lst.head
    else maxLin(lst.tail)
  } 
  //La misma funcion pero implementando tailrec o funcion recursiva de cola
  
  def maxIt(lst: List[Int]): Int = {
    @tailrec
    def maxItAux(lst: List[Int], max: Int): Int = {
        if (lst.isEmpty) max
        else if (lst.head > max) maxItAux(lst.tail, lst.head)
        else maxItAux(lst.tail, max)
    }
    // Iniciamos la recursión con el primer elemento de la lista
    maxItAux(lst.tail, lst.head)
    }
}
