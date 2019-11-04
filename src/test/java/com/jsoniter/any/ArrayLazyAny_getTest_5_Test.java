package com.jsoniter.any;

import com.jsoniter.any.Any;
import com.jsoniter.any.ArrayLazyAny;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ArrayLazyAny_getTest_5_Test {
  @Test
  public void getTest() throws Exception {
    // Arrange
    ArrayLazyAny arrayLazyAny = new ArrayLazyAny(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 167772161, 1);
    int index = 1;

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    arrayLazyAny.get(index);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
