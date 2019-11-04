package com.jsoniter.any;

import com.jsoniter.ValueType;
import com.jsoniter.any.IntAny;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class IntAny_valueTypeTest_13_Test {
//failed_pass   @Test
//  public void valueTypeTest() throws Exception {
//    // Arrange
//    IntAny intAny = new IntAny(1);
//
//    // Act
//    ValueType actual = intAny.valueType();
//
//    // Assert
//    Assert.assertEquals(ValueType.NUMBER, actual);
//    float toFloatResult = intAny.toFloat();
//    long toLongResult = intAny.toLong();
//    String toStringResult = intAny.toString();
//    int toIntResult = intAny.toInt();
//    boolean toBooleanResult = intAny.toBoolean();
//    double toDoubleResult = intAny.toDouble();
//    Assert.assertEquals(1.0f, toFloatResult);
//    Assert.assertEquals(0, intAny.size());
//    Assert.assertEquals(1.0, toDoubleResult);
//    Assert.assertTrue(toBooleanResult);
//    Assert.assertEquals(1, toIntResult);
//    Assert.assertEquals("1", toStringResult);
//    Assert.assertEquals(1L, toLongResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
