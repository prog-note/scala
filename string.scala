object Main {
  def main(args: Array[String]) {

    var simple = "test"

    var interpolate = s"This is $simple"

    var multipleStr = """
Multiline:
  first line
  second line
  third line
"""

    var alignMultipleStr = """
    |Aligned:
    |  first line
    |  second line
    |  third line
    """.stripMargin

  }
}
