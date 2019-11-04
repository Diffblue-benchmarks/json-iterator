package com.jsoniter.spi;

import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Builder_toStringTest_13_Test {
  @Test
  public void toStringTest() throws Exception {
    // Arrange
    Config.Builder builder = new Config.Builder();

    // Act
    String actual = builder.toString();

    // Assert
    Assert.assertEquals(
        "Config{decodingMode=REFLECTION_MODE, encodingMode=REFLECTION_MODE, indentionStep=0, escapeUnicode=true, omitDefaultValue=false}",
        actual);
    Assert.assertEquals(
        "Config{decodingMode=REFLECTION_MODE, encodingMode=REFLECTION_MODE, indentionStep=0, escapeUnicode=true, omitDefaultValue=false}",
        builder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
