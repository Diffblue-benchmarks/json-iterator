package com.jsoniter.spi;

import com.jsoniter.output.JsonStream;
import com.jsoniter.spi.Encoder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class StringFloatEncoder_encodeFloatTest_1_Test {
  @Test
  public void encodeFloatTest() throws Exception {
    // Arrange
    Encoder.StringFloatEncoder stringFloatEncoder = new Encoder.StringFloatEncoder();
    float obj = 1.0f;
    JsonStream jsonStream = (JsonStream) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    stringFloatEncoder.encodeFloat(obj, jsonStream);
    Assert.assertEquals(null, jsonStream);
    Assert.assertNotNull(stringFloatEncoder.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
