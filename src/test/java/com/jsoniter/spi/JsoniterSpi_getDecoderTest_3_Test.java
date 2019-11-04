package com.jsoniter.spi;

import com.jsoniter.spi.Decoder;
import com.jsoniter.spi.JsoniterSpi;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JsoniterSpi_getDecoderTest_3_Test {
  @Test
  public void getDecoderTest() throws Exception {
    // Arrange
    String cacheKey = "aaaaa";

    // Act
    Decoder actual = JsoniterSpi.getDecoder(cacheKey);

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
