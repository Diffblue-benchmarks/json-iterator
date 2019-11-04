package com.jsoniter.any;

import com.jsoniter.ValueType;
import com.jsoniter.any.ObjectLazyAny;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ObjectLazyAny_valueTypeTest_11_Test {
  @Test
  public void valueTypeTest() throws Exception {
    // Arrange
    ObjectLazyAny objectLazyAny = new ObjectLazyAny(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 167772161, 1);

    // Act
    ValueType actual = objectLazyAny.valueType();

    // Assert
    Assert.assertEquals(ValueType.OBJECT, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
