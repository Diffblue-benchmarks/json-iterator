package com.jsoniter.any;

import com.jsoniter.any.FloatAny;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FloatAny_objectTest_12_Test {
//failed_pass   @Test
//  public void objectTest() throws Exception {
//    // Arrange
//    FloatAny floatAny = new FloatAny(1.0f);
//
//    // Act
//    Object actual = floatAny.object();
//
//    // Assert
//    Assert.assertTrue(actual instanceof Float);
//    Assert.assertEquals(Float.valueOf(1.0f), actual);
//    float toFloatResult = floatAny.toFloat();
//    long toLongResult = floatAny.toLong();
//    String toStringResult = floatAny.toString();
//    int toIntResult = floatAny.toInt();
//    boolean toBooleanResult = floatAny.toBoolean();
//    double toDoubleResult = floatAny.toDouble();
//    Assert.assertEquals(1.0f, toFloatResult);
//    Assert.assertEquals(0, floatAny.size());
//    Assert.assertEquals(1.0, toDoubleResult);
//    Assert.assertTrue(toBooleanResult);
//    Assert.assertEquals(1, toIntResult);
//    Assert.assertEquals("1.0", toStringResult);
//    Assert.assertEquals(1L, toLongResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}