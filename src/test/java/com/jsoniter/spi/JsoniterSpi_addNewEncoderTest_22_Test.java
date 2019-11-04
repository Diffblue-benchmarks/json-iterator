package com.jsoniter.spi;

import com.jsoniter.spi.Encoder;
import com.jsoniter.spi.JsoniterSpi;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JsoniterSpi_addNewEncoderTest_22_Test {
  @Test
  public void addNewEncoderTest() throws Exception {
    // Arrange
    String cacheKey = "aaaaa";
    Encoder.StringDoubleEncoder encoder = new Encoder.StringDoubleEncoder();

    // Act
    JsoniterSpi.addNewEncoder(cacheKey, encoder);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
