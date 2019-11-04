package com.jsoniter.spi;

import com.jsoniter.spi.Encoder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StringIntEncoder_Encoder$StringIntEncoderTest_2_Test {
  @Test
  public void Encoder$StringIntEncoderTest() throws Exception {
    // Arrange and Act
    Encoder.StringIntEncoder stringIntEncoder = new Encoder.StringIntEncoder();

    // Assert
    Assert.assertNotNull(stringIntEncoder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
