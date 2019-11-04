package com.jsoniter.any;

import com.jsoniter.any.ArrayLazyAny;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ArrayLazyAny_toFloatTest_7_Test {
  @Test
  public void toFloatTest() throws Exception {
    // Arrange
    ArrayLazyAny arrayLazyAny = new ArrayLazyAny(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 167772161, 1);

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    arrayLazyAny.toFloat();
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
