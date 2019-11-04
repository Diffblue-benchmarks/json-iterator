package com.jsoniter.spi;

import com.jsoniter.spi.Encoder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StringLongEncoder_Encoder$StringLongEncoderTest_2_Test {
  @Test
  public void Encoder$StringLongEncoderTest() throws Exception {
    // Arrange and Act
    Encoder.StringLongEncoder stringLongEncoder = new Encoder.StringLongEncoder();

    // Assert
    Assert.assertNotNull(stringLongEncoder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
