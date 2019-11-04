package com.jsoniter.spi;

import com.jsoniter.output.JsonStream;
import com.jsoniter.spi.Encoder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class StringIntEncoder_encodeIntTest_1_Test {
  @Test
  public void encodeIntTest() throws Exception {
    // Arrange
    Encoder.StringIntEncoder stringIntEncoder = new Encoder.StringIntEncoder();
    int obj = 1;
    JsonStream jsonStream = (JsonStream) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    stringIntEncoder.encodeInt(obj, jsonStream);
    Assert.assertEquals(null, jsonStream);
    Assert.assertNotNull(stringIntEncoder.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
