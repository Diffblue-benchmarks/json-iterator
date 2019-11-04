package com.jsoniter.any;

import com.jsoniter.ValueType;
import com.jsoniter.any.StringLazyAny;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StringLazyAny_valueTypeTest_8_Test {
  @Test
  public void valueTypeTest() throws Exception {
    // Arrange
    StringLazyAny stringLazyAny = new StringLazyAny(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 167772161, 1);

    // Act
    ValueType actual = stringLazyAny.valueType();

    // Assert
    Assert.assertEquals(ValueType.STRING, actual);
    Assert.assertEquals(0, stringLazyAny.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
