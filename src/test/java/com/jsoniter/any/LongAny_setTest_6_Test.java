package com.jsoniter.any;

import com.jsoniter.any.Any;
import com.jsoniter.any.LongAny;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class LongAny_setTest_6_Test {
  @Test
  public void setTest() throws Exception {
    // Arrange
    LongAny longAny = new LongAny(1L);
    long newVal = 1L;

    // Act
    Any actual = longAny.set(newVal);

    // Assert
    Assert.assertSame(longAny, actual);
    Assert.assertTrue(actual instanceof LongAny);
    Assert.assertSame(longAny, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
