object Main {
  def main(args: Array[String]) {

    val name = "Den"

    val add_short = (a:Int, b:Int) =>  s"Hello $name! result: ${a + b}"

    val add_origin = new Function2[Int, Int, String] {
      def apply(a: Int, b: Int) = s"Hello $name! result: ${a + b}"
    }

    println(add_short(1, 1))
    println(add_origin(2, 2))
  }
}
