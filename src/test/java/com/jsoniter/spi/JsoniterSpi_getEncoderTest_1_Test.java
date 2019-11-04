package com.jsoniter.spi;

import com.jsoniter.spi.Encoder;
import com.jsoniter.spi.JsoniterSpi;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JsoniterSpi_getEncoderTest_1_Test {
  @Test
  public void getEncoderTest() throws Exception {
    // Arrange
    String cacheKey = "aaaaa";

    // Act
    Encoder actual = JsoniterSpi.getEncoder(cacheKey);

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
