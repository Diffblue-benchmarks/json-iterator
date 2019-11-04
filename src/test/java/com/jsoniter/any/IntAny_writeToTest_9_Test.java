package com.jsoniter.any;

import com.jsoniter.any.IntAny;
import com.jsoniter.output.JsonStream;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class IntAny_writeToTest_9_Test {
  @Test
  public void writeToTest() throws Exception {
    // Arrange
    IntAny intAny = new IntAny(1);
    JsonStream jsonStream = (JsonStream) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    intAny.writeTo(jsonStream);
    Assert.assertEquals(null, jsonStream);
    float toFloatResult = intAny.toFloat();
    long toLongResult = intAny.toLong();
    String toStringResult = intAny.toString();
    int toIntResult = intAny.toInt();
    boolean toBooleanResult = intAny.toBoolean();
    double toDoubleResult = intAny.toDouble();
    Assert.assertEquals(1.0f, toFloatResult);
    Assert.assertEquals(0, intAny.size());
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
