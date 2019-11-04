package com.jsoniter.spi;

import com.jsoniter.output.JsonStream;
import com.jsoniter.spi.Encoder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class StringShortEncoder_encodeShortTest_1_Test {
  @Test
  public void encodeShortTest() throws Exception {
    // Arrange
    Encoder.StringShortEncoder stringShortEncoder = new Encoder.StringShortEncoder();
    short obj = (short) 1;
    JsonStream jsonStream = (JsonStream) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    stringShortEncoder.encodeShort(obj, jsonStream);
    Assert.assertEquals(null, jsonStream);
    Assert.assertNotNull(stringShortEncoder.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
