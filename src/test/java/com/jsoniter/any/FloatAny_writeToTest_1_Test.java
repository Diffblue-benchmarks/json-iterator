package com.jsoniter.any;

import com.jsoniter.any.FloatAny;
import com.jsoniter.output.JsonStream;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class FloatAny_writeToTest_1_Test {
  @Test
  public void writeToTest() throws Exception {
    // Arrange
    FloatAny floatAny = new FloatAny(1.0f);
    JsonStream jsonStream = (JsonStream) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    floatAny.writeTo(jsonStream);
    Assert.assertEquals(null, jsonStream);
    float toFloatResult = floatAny.toFloat();
    long toLongResult = floatAny.toLong();
    String toStringResult = floatAny.toString();
    int toIntResult = floatAny.toInt();
    boolean toBooleanResult = floatAny.toBoolean();
    double toDoubleResult = floatAny.toDouble();
    Assert.assertEquals(1.0f, toFloatResult);
    Assert.assertEquals(0, floatAny.size());
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
