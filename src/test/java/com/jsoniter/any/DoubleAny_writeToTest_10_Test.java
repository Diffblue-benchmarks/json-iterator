package com.jsoniter.any;

import com.jsoniter.any.DoubleAny;
import com.jsoniter.output.JsonStream;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class DoubleAny_writeToTest_10_Test {
  @Test
  public void writeToTest() throws Exception {
    // Arrange
    DoubleAny doubleAny = new DoubleAny(1.0);
    JsonStream jsonStream = (JsonStream) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    doubleAny.writeTo(jsonStream);
    Assert.assertEquals(null, jsonStream);
    float toFloatResult = doubleAny.toFloat();
    long toLongResult = doubleAny.toLong();
    String toStringResult = doubleAny.toString();
    int toIntResult = doubleAny.toInt();
    boolean toBooleanResult = doubleAny.toBoolean();
    double toDoubleResult = doubleAny.toDouble();
    Assert.assertEquals(1.0f, toFloatResult);
    Assert.assertEquals(0, doubleAny.size());
    Assert.assertEquals(1.0, toDoubleResult);
    Assert.assertTrue(toBooleanResult);
    Assert.assertEquals(1, toIntResult);
    Assert.assertEquals("1.0", toStringResult);
    Assert.assertEquals(1L, toLongResult);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
