package com.jsoniter.any;

import com.jsoniter.ValueType;
import com.jsoniter.any.LongLazyAny;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class LongLazyAny_valueTypeTest_4_Test {
  @Test
  public void valueTypeTest() throws Exception {
    // Arrange
    LongLazyAny longLazyAny = new LongLazyAny(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 167772161, 1);

    // Act
    ValueType actual = longLazyAny.valueType();

    // Assert
    Assert.assertEquals(ValueType.NUMBER, actual);
    Assert.assertEquals(0, longLazyAny.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
