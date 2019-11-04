package com.jsoniter.spi;

import com.jsoniter.spi.Config;
import com.jsoniter.spi.JsoniterSpi;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JsoniterSpi_setCurrentConfigTest_28_Test {
  @Test
  public void setCurrentConfigTest() throws Exception {
    // Arrange
    Config.Builder builder = new Config.Builder();
    Config config = new Config("aaaaa", builder);

    // Act
    JsoniterSpi.setCurrentConfig(config);

    // Assert
    String toStringResult = config.toString();
    Config.Builder builderResult = config.builder();
    Assert.assertNotNull(toStringResult);
    Assert.assertSame(builder, builderResult);
    Assert.assertEquals(
        "Config{decodingMode=REFLECTION_MODE, encodingMode=REFLECTION_MODE, indentionStep=0, escapeUnicode=true, omitDefaultValue=false}",
        builderResult.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
