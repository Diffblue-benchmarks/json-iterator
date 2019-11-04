package com.jsoniter.spi;

import com.jsoniter.output.EncodingMode;
import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Builder_encodingModeTest_21_Test {
  @Test
  public void encodingModeTest() throws Exception {
    // Arrange
    Config.Builder builder = new Config.Builder();
    EncodingMode encodingMode = EncodingMode.DYNAMIC_MODE;

    // Act
    Config.Builder actual = builder.encodingMode(encodingMode);

    // Assert
    Assert.assertSame(builder, actual);
    Assert.assertEquals(
        "Config{decodingMode=REFLECTION_MODE, encodingMode=DYNAMIC_MODE, indentionStep=0, escapeUnicode=true, omitDefaultValue=false}",
        actual.toString());
    Assert.assertSame(actual, builder);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
