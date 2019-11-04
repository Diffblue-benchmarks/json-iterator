package com.jsoniter.spi;

import com.jsoniter.spi.JsoniterSpi;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JsoniterSpi_JsoniterSpiTest_9_Test {
  @Test
  public void JsoniterSpiTest() throws Exception {
    // Arrange and Act
    JsoniterSpi jsoniterSpi = new JsoniterSpi();

    // Assert
    Assert.assertNotNull(jsoniterSpi.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
