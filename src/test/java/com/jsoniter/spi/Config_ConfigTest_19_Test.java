package com.jsoniter.spi;

import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Config_ConfigTest_19_Test {
  @Test
  public void ConfigTest() throws Exception {
    // Arrange
    String configName = "aaaaa";
    Config.Builder builder = new Config.Builder();

    // Act
    Config config = new Config(configName, builder);

    // Assert
    Config.Builder builderResult = config.builder();
    Assert.assertSame(builder, builderResult);
    Assert.assertEquals(
        "Config{decodingMode=REFLECTION_MODE, encodingMode=REFLECTION_MODE, indentionStep=0, escapeUnicode=true, omitDefaultValue=false}",
        builderResult.toString());
    Assert.assertSame(builderResult, builder);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
