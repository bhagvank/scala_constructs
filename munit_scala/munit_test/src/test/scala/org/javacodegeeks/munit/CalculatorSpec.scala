package org.javacodegeeks.munit

import org.javacodegeeks.munit.Calculator

class CalculatorSpec extends munit.FunSuite {

  test("adds two numbers") {
    assertEquals(Calculator.addNumbers(4, 8), 12)
  }
  
  test("multiplies two numbers") {
    assertEquals(Calculator.multNumbers(5, 9), 45)
  }

  test("considers collections with the same elements equal") {
    assertEquals(Seq(4, 5), Seq(4, 5))
  }

  

}