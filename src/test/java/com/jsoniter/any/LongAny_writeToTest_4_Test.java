package com.jsoniter.any;

import com.jsoniter.any.LongAny;
import com.jsoniter.output.JsonStream;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class LongAny_writeToTest_4_Test {
  @Test
  public void writeToTest() throws Exception {
    // Arrange
    LongAny longAny = new LongAny(1L);
    JsonStream jsonStream = (JsonStream) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    longAny.writeTo(jsonStream);
    Assert.assertEquals(null, jsonStream);
    float toFloatResult = longAny.toFloat();
    long toLongResult = longAny.toLong();
    String toStringResult = longAny.toString();
    int toIntResult = longAny.toInt();
    boolean toBooleanResult = longAny.toBoolean();
    double toDoubleResult = longAny.toDouble();
    Assert.assertEquals(1.0f, toFloatResult);
    Assert.assertEquals(0, longAny.size());
    Assert.assertEquals(1.0, toDoubleResult);
    Assert.assertTrue(toBooleanResult);
    Assert.assertEquals(1, toIntResult);
    Assert.assertEquals("1", toStringResult);
    Assert.assertEquals(1L, toLongResult);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
