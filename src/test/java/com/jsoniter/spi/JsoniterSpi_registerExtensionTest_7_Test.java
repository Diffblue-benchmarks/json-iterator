package com.jsoniter.spi;

import com.jsoniter.extra.GsonCompatibilityMode;
import com.jsoniter.spi.JsoniterSpi;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JsoniterSpi_registerExtensionTest_7_Test {
  @Test
  public void registerExtensionTest() throws Exception {
    // Arrange
    GsonCompatibilityMode gsonCompatibilityMode = (GsonCompatibilityMode) null;

    // Act
    JsoniterSpi.registerExtension(gsonCompatibilityMode);

    // Assert
    Assert.assertEquals(null, gsonCompatibilityMode);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
