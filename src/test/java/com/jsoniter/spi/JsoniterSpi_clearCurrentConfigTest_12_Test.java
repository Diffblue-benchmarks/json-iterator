package com.jsoniter.spi;

import com.jsoniter.spi.JsoniterSpi;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JsoniterSpi_clearCurrentConfigTest_12_Test {
  @Test
  public void clearCurrentConfigTest() throws Exception {
    // Arrange and Act
    JsoniterSpi.clearCurrentConfig();
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
