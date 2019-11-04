package com.jsoniter.spi;

import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Builder_copyTest_2_Test {
  @Test
  public void copyTest() throws Exception {
    // Arrange
    Config.Builder builder = new Config.Builder();

    // Act
    Config.Builder actual = builder.copy();

    // Assert
    Assert.assertEquals(
        "Config{decodingMode=REFLECTION_MODE, encodingMode=REFLECTION_MODE, indentionStep=0, escapeUnicode=true, omitDefaultValue=false}",
        actual.toString());
    Assert.assertEquals(
        "Config{decodingMode=REFLECTION_MODE, encodingMode=REFLECTION_MODE, indentionStep=0, escapeUnicode=true, omitDefaultValue=false}",
        builder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
