package com.jsoniter.output;

import com.jsoniter.output.JsonStream;
import com.jsoniter.spi.Encoder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JsonStream_registerNativeEncoderTest_22_Test {
  @Test
  public void registerNativeEncoderTest() throws Exception {
    // Arrange
    Class resultClass = (Class) null;
    Encoder.StringDoubleEncoder stringDoubleEncoder = new Encoder.StringDoubleEncoder();

    // Act
    JsonStream.registerNativeEncoder(resultClass, stringDoubleEncoder);

    // Assert
    Assert.assertEquals(null, resultClass);
    Assert.assertNotNull(stringDoubleEncoder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
