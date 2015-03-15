// Comparable[T] is generic trait
//   where `T` is type which will be defined later

trait Comparable[T] {
  def compareTo(x: T): Int

  def lS(sub: T) = compareTo(sub) > 0
  def gT(sub: T) = compareTo(sub) < 0
  def eQ(sub: T) = compareTo(sub) == 0
}

class Circle(val radius: Int) extends Comparable[Circle] {
  def compareTo(x: Circle) = x.radius - radius
}

// ALTERNATIVE WAY FOR TYPE DEFINITION
//
// trait Comparable {
//   type T
//   ...
//
// class Circle(..) extends Comparable {
//   type T = <propper Type>
//   ...


object Main {
  def main(args: Array[String]) {
    val circle = new Circle(5)
    val circle2 = new Circle(3)

    println(s"Less:    ${ circle.lS(circle2) }")
    println(s"Greater: ${ circle.gT(circle2) }")
    println(s"Eql:     ${ circle.eQ(circle2) }")
  }
}
