package com.jsoniter.any;

import com.jsoniter.ValueType;
import com.jsoniter.any.ArrayWrapperAny;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ArrayWrapperAny_valueTypeTest_1_Test {
  @Test
  public void valueTypeTest() throws Exception {
    // Arrange
    ArrayWrapperAny arrayWrapperAny = new ArrayWrapperAny("aaaaa");

    // Act
    ValueType actual = arrayWrapperAny.valueType();

    // Assert
    Assert.assertEquals(ValueType.ARRAY, actual);
    Assert.assertEquals("\"aaaaa\"", arrayWrapperAny.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
