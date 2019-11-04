package com.jsoniter.any;

import com.jsoniter.ValueType;
import com.jsoniter.any.DoubleAny;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DoubleAny_valueTypeTest_11_Test {
//failed_pass   @Test
//  public void valueTypeTest() throws Exception {
//    // Arrange
//    DoubleAny doubleAny = new DoubleAny(1.0);
//
//    // Act
//    ValueType actual = doubleAny.valueType();
//
//    // Assert
//    Assert.assertEquals(ValueType.NUMBER, actual);
//    float toFloatResult = doubleAny.toFloat();
//    long toLongResult = doubleAny.toLong();
//    String toStringResult = doubleAny.toString();
//    int toIntResult = doubleAny.toInt();
//    boolean toBooleanResult = doubleAny.toBoolean();
//    Assert.assertEquals(1.0f, toFloatResult);
//    Assert.assertEquals(1.0, doubleAny.toDouble());
//    Assert.assertTrue(toBooleanResult);
//    Assert.assertEquals(1, toIntResult);
//    Assert.assertEquals("1.0", toStringResult);
//    Assert.assertEquals(1L, toLongResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
