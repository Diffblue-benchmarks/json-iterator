package com.jsoniter.spi;

import com.jsoniter.output.EncodingMode;
import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Config_encodingModeTest_9_Test {
  @Test
  public void encodingModeTest() throws Exception {
    // Arrange
    Config.Builder builder = new Config.Builder();
    Config config = new Config("aaaaa", builder);

    // Act
    EncodingMode actual = config.encodingMode();

    // Assert
    Assert.assertEquals(EncodingMode.REFLECTION_MODE, actual);
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
