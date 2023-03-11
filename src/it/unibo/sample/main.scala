import it.unibo.sample.Shape.*
import it.unibo.sample.Point2D

@main
def main(): Unit = {
  val rectangle = Rectangle(Point2D(0, 0), Point2D(10, 10))
  val circle = Circle(Point2D(0, 0), 10)
  println("Shapes: ")
  println(rectangle)
  println(circle)
  println("Area: ")
  println(rectangle.area)
  println(circle.area)
  println("Perimeter: ")
  println(rectangle.perimeter)
  println(circle.perimeter)
}