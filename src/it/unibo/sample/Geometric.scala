package it.unibo.sample

case class Point2D(x: Double, y: Double)

object Point2D:
  val zero: Point2D = Point2D(0, 0)

enum Shape:
  case Circle(center: Point2D, radius: Double)
  case Rectangle(lowerLeft: Point2D, upperRight: Point2D)
  
  def area: Double = this match
    case Circle(_, r) => math.Pi * r * r
    case Rectangle(Point2D(x1, y1), Point2D(x2, y2)) => (x2 - x1) * (y2 - y1)
    
  def perimeter: Double = this match
    case Circle(_, r) => 2 * math.Pi * r
    case Rectangle(Point2D(x1, y1), Point2D(x2, y2)) => 2 * (x2 - x1) + 2 * (y2 - y1)
