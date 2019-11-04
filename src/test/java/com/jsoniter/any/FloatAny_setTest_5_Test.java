package com.jsoniter.any;

import com.jsoniter.any.Any;
import com.jsoniter.any.FloatAny;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FloatAny_setTest_5_Test {
  @Test
  public void setTest() throws Exception {
    // Arrange
    FloatAny floatAny = new FloatAny(1.0f);
    float newVal = 1.0f;

    // Act
    Any actual = floatAny.set(newVal);

    // Assert
    Assert.assertSame(floatAny, actual);
    Assert.assertTrue(actual instanceof FloatAny);
    Assert.assertSame(floatAny, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
