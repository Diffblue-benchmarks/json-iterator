package com.jsoniter.any;

import com.jsoniter.any.Any;
import com.jsoniter.any.IntAny;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class IntAny_setTest_10_Test {
  @Test
  public void setTest() throws Exception {
    // Arrange
    IntAny intAny = new IntAny(1);
    int newVal = 1;

    // Act
    Any actual = intAny.set(newVal);

    // Assert
    Assert.assertSame(intAny, actual);
    Assert.assertTrue(actual instanceof IntAny);
    Assert.assertSame(intAny, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
