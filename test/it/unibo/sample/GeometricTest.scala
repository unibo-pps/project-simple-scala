package it.unibo.sample

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import it.unibo.sample.Shape.*
class GeometricTest:
  private val acceptedDelta = 0.1
  @Test
  def testCircleArea(): Unit =
    val circle = Circle(Point2D.zero, 1)
    assertEquals(Math.PI, circle.area, acceptedDelta)

  @Test
  def testRectangleArea(): Unit =
    val topRight = Point2D(1, 2)
    val rectangle = Rectangle(Point2D.zero, topRight)
    assertEquals(2, rectangle.area, acceptedDelta)

  @Test
  def testPerimeterRectangle(): Unit =
    val shortSide = 1
    val longSide = 2
    val topRight = Point2D(shortSide, longSide)
    val rectangle = Rectangle(Point2D.zero, topRight)
    assertEquals(shortSide * 2 + longSide * 2, rectangle.perimeter, acceptedDelta)

  @Test
  def testPerimeterCircle(): Unit =
    val circle = Circle(Point2D.zero, 1)
    assertEquals(2 * Math.PI, circle.perimeter, acceptedDelta)