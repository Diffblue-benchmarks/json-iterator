package com.jsoniter.any;

import com.jsoniter.any.LongAny;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class LongAny_objectTest_8_Test {
//failed_pass   @Test
//  public void objectTest() throws Exception {
//    // Arrange
//    LongAny longAny = new LongAny(1L);
//
//    // Act
//    Object actual = longAny.object();
//
//    // Assert
//    Assert.assertTrue(actual instanceof Long);
//    Assert.assertEquals(Long.valueOf(1L), actual);
//    float toFloatResult = longAny.toFloat();
//    long toLongResult = longAny.toLong();
//    String toStringResult = longAny.toString();
//    int toIntResult = longAny.toInt();
//    boolean toBooleanResult = longAny.toBoolean();
//    double toDoubleResult = longAny.toDouble();
//    Assert.assertEquals(1.0f, toFloatResult);
//    Assert.assertEquals(0, longAny.size());
//    Assert.assertEquals(1.0, toDoubleResult);
//    Assert.assertTrue(toBooleanResult);
//    Assert.assertEquals(1, toIntResult);
//    Assert.assertEquals("1", toStringResult);
//    Assert.assertEquals(1L, toLongResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}