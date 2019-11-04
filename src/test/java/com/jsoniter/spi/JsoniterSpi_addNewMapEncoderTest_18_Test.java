package com.jsoniter.spi;

import com.jsoniter.spi.Encoder;
import com.jsoniter.spi.JsoniterSpi;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JsoniterSpi_addNewMapEncoderTest_18_Test {
  @Test
  public void addNewMapEncoderTest() throws Exception {
    // Arrange
    String cacheKey = "aaaaa";
    Encoder.StringDoubleEncoder stringDoubleEncoder = new Encoder.StringDoubleEncoder();

    // Act
    JsoniterSpi.addNewMapEncoder(cacheKey, stringDoubleEncoder);

    // Assert
    Assert.assertNotNull(stringDoubleEncoder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
