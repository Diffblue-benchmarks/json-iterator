package com.jsoniter.spi;

import com.jsoniter.output.JsonStream;
import com.jsoniter.spi.Encoder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class StringDoubleEncoder_encodeDoubleTest_2_Test {
  @Test
  public void encodeDoubleTest() throws Exception {
    // Arrange
    Encoder.StringDoubleEncoder stringDoubleEncoder = new Encoder.StringDoubleEncoder();
    double obj = 1.0;
    JsonStream jsonStream = (JsonStream) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    stringDoubleEncoder.encodeDouble(obj, jsonStream);
    Assert.assertEquals(null, jsonStream);
    Assert.assertNotNull(stringDoubleEncoder.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
