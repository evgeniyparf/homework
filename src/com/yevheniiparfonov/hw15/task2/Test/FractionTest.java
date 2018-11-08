package com.yevheniiparfonov.hw15.task2.Test;

import com.yevheniiparfonov.hw15.task2.Fraction;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class FractionTest {
  @Test
  public void multTest() {
    Fraction actual = new Fraction(3, 4).mult(0.1);
    Fraction expected = new Fraction(3, 40);
    assertEquals(expected, actual);
  }

  @Test
  public void divideTest() {

    Fraction actual = new Fraction(3, 4).divide(0.1);
    Fraction expected = new Fraction(30, 4);

    assertEquals(expected, actual);
  }

  @Test
  public void convertTest() {
    Fraction fraction = Fraction.convert(0.1);
    Fraction expected = new Fraction(1, 10);
    assertEquals(expected, fraction);
  }

  @Test
  public void sumTest() {
    Fraction actual = new Fraction(3, 4).sum(new Fraction(3, 4));
    Fraction expected = new Fraction(6, 4);
    assertEquals(expected, actual);
  }

  @ParameterizedTest
  @ValueSource(ints = {1, 10})
  public void convertTest_NotNull(int num){
    assertNotNull(Fraction.convert(num));
  }

}