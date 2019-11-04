package com.jsoniter.any;

import com.jsoniter.any.Any;
import com.jsoniter.any.DoubleAny;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DoubleAny_setTest_8_Test {
  @Test
  public void setTest() throws Exception {
    // Arrange
    DoubleAny doubleAny = new DoubleAny(1.0);
    double newVal = 1.0;

    // Act
    Any actual = doubleAny.set(newVal);

    // Assert
    Assert.assertSame(doubleAny, actual);
    Assert.assertTrue(actual instanceof DoubleAny);
    Assert.assertSame(doubleAny, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
