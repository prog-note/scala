import math._


class Circle(r: Int) {
  val radius = r

  // val - R  - getter
  // var - RW - getter/setter
  //
  // auto properties:
  //
  //   class Circle(val radius: Int,
  //                var str: String,
  //                private var _str: String = "default") {
  //

  def area = Pi * pow(radius, 2)
  def circumference = 2 * Pi * r

  override def toString = s"""
  |Circle
  |  -> radius:         $radius
  |  -> area:           $area
  |  -> circumference:  $circumference
  """.stripMargin
}


class Cylinder(val height: Int, r: Int = 0) extends Circle(r) {
  def volume = super.area * height

  override def area = 2 * super.area + height * circumference
  override def toString = s"""
  |Cylinder
  |  -> height: $height
  |  -> area:   $area
  |  -> volume: $volume
  |
  |  Base Circle
  |    -> radius:         $radius
  |    -> area:           ${super.area}
  |    -> circumference:  $circumference
  """.stripMargin
}


object Main {
  def main(args: Array[String]) {

    println(new Circle(3))
    println(new Cylinder(8, 3))

  }
}
