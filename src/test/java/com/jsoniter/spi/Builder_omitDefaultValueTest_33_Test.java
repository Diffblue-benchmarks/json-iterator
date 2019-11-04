package com.jsoniter.spi;

import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Builder_omitDefaultValueTest_33_Test {
  @Test
  public void omitDefaultValueTest() throws Exception {
    // Arrange
    Config.Builder builder = new Config.Builder();
    boolean omitDefaultValue = true;

    // Act
    Config.Builder actual = builder.omitDefaultValue(omitDefaultValue);

    // Assert
    Assert.assertSame(builder, actual);
    Assert.assertEquals(
        "Config{decodingMode=REFLECTION_MODE, encodingMode=REFLECTION_MODE, indentionStep=0, escapeUnicode=true, omitDefaultValue=true}",
        actual.toString());
    Assert.assertSame(actual, builder);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
