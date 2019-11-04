package com.jsoniter.spi;

import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Builder_indentionStepTest_24_Test {
  @Test
  public void indentionStepTest() throws Exception {
    // Arrange
    Config.Builder builder = new Config.Builder();
    int indentionStep = 1;

    // Act
    Config.Builder actual = builder.indentionStep(indentionStep);

    // Assert
    Assert.assertSame(builder, actual);
    Assert.assertEquals(
        "Config{decodingMode=REFLECTION_MODE, encodingMode=REFLECTION_MODE, indentionStep=1, escapeUnicode=true, omitDefaultValue=false}",
        actual.toString());
    Assert.assertSame(actual, builder);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
