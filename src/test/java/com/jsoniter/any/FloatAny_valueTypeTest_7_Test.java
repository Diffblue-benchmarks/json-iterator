package com.jsoniter.any;

import com.jsoniter.ValueType;
import com.jsoniter.any.FloatAny;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FloatAny_valueTypeTest_7_Test {
//failed_pass   @Test
//  public void valueTypeTest() throws Exception {
//    // Arrange
//    FloatAny floatAny = new FloatAny(1.0f);
//
//    // Act
//    ValueType actual = floatAny.valueType();
//
//    // Assert
//    Assert.assertEquals(ValueType.NUMBER, actual);
//    long toLongResult = floatAny.toLong();
//    String toStringResult = floatAny.toString();
//    int toIntResult = floatAny.toInt();
//    boolean toBooleanResult = floatAny.toBoolean();
//    double toDoubleResult = floatAny.toDouble();
//    Assert.assertEquals(1L, toLongResult);
//    Assert.assertEquals(0, floatAny.size());
//    Assert.assertEquals(1.0, toDoubleResult);
//    Assert.assertTrue(toBooleanResult);
//    Assert.assertEquals(1, toIntResult);
//    Assert.assertEquals("1.0", toStringResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
