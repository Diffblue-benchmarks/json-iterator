package com.jsoniter.any;

import com.jsoniter.ValueType;
import com.jsoniter.any.ArrayLazyAny;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ArrayLazyAny_valueTypeTest_12_Test {
  @Test
  public void valueTypeTest() throws Exception {
    // Arrange
    ArrayLazyAny arrayLazyAny = new ArrayLazyAny(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 167772161, 1);

    // Act
    ValueType actual = arrayLazyAny.valueType();

    // Assert
    Assert.assertEquals(ValueType.ARRAY, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
