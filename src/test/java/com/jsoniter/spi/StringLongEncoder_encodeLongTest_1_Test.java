package com.jsoniter.spi;

import com.jsoniter.output.JsonStream;
import com.jsoniter.spi.Encoder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class StringLongEncoder_encodeLongTest_1_Test {
  @Test
  public void encodeLongTest() throws Exception {
    // Arrange
    Encoder.StringLongEncoder stringLongEncoder = new Encoder.StringLongEncoder();
    long obj = 1L;
    JsonStream jsonStream = (JsonStream) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    stringLongEncoder.encodeLong(obj, jsonStream);
    Assert.assertEquals(null, jsonStream);
    Assert.assertNotNull(stringLongEncoder.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
