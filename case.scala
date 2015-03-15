object Main {
  def check(num: Int) = num match {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
    case _ => "doesn't matter"
  }

  def main(args: Array[String]) {
    println(check(1))
    println(check(6))
  }
}
