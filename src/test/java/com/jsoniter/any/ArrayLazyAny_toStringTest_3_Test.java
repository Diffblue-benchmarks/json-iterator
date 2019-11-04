package com.jsoniter.any;

import com.jsoniter.any.ArrayLazyAny;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ArrayLazyAny_toStringTest_3_Test {
  @Test
  public void toStringTest() throws Exception {
    // Arrange
    ArrayLazyAny arrayLazyAny = new ArrayLazyAny(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 167772161, 1);

    // Act and Assert
    thrown.expect(StringIndexOutOfBoundsException.class);
    arrayLazyAny.toString();
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
