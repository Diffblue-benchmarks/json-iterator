package com.jsoniter.any;

import com.jsoniter.ValueType;
import com.jsoniter.any.StringAny;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StringAny_valueTypeTest_10_Test {
  @Test
  public void valueTypeTest() throws Exception {
    // Arrange
    StringAny stringAny = new StringAny("aaaaa");

    // Act
    ValueType actual = stringAny.valueType();

    // Assert
    Assert.assertEquals(ValueType.STRING, actual);
    String toStringResult = stringAny.toString();
    Assert.assertEquals("aaaaa", toStringResult);
    Assert.assertEquals(0, stringAny.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
