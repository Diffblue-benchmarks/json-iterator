package com.jsoniter.any;

import com.jsoniter.ValueType;
import com.jsoniter.any.DoubleLazyAny;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DoubleLazyAny_valueTypeTest_3_Test {
  @Test
  public void valueTypeTest() throws Exception {
    // Arrange
    DoubleLazyAny doubleLazyAny = new DoubleLazyAny(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 167772161, 1);

    // Act
    ValueType actual = doubleLazyAny.valueType();

    // Assert
    Assert.assertEquals(ValueType.NUMBER, actual);
    Assert.assertEquals(0, doubleLazyAny.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
