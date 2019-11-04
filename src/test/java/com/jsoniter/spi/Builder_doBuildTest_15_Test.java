package com.jsoniter.spi;

import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Builder_doBuildTest_15_Test {
  @Test
  public void doBuildTest() throws Exception {
    // Arrange
    Config.Builder builder = new Config.Builder();
    String configName = "aaaaa";

    // Act
    Config actual = builder.doBuild(configName);

    // Assert
    String toStringResult = actual.toString();
    Config.Builder builderResult = actual.builder();
    Assert.assertNotNull(toStringResult);
    Assert.assertSame(builder, builderResult);
    Assert.assertEquals(
        "Config{decodingMode=REFLECTION_MODE, encodingMode=REFLECTION_MODE, indentionStep=0, escapeUnicode=true, omitDefaultValue=false}",
        builderResult.toString());
    Assert.assertSame(builderResult, builder);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
