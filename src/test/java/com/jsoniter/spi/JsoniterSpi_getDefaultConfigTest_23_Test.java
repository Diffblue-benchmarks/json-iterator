package com.jsoniter.spi;

import com.jsoniter.spi.Config;
import com.jsoniter.spi.JsoniterSpi;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JsoniterSpi_getDefaultConfigTest_23_Test {
  @Test
  public void getDefaultConfigTest() throws Exception {
    // Arrange and Act
    Config actual = JsoniterSpi.getDefaultConfig();

    // Assert
    String toStringResult = actual.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(
        "Config{decodingMode=REFLECTION_MODE, encodingMode=REFLECTION_MODE, indentionStep=0, escapeUnicode=true, omitDefaultValue=false}",
        (actual.builder()).toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
