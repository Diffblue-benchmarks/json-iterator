package com.jsoniter.extra;

import com.jsoniter.extra.JacksonCompatibilityMode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Builder_toStringTest_25_Test {
  @Test
  public void toStringTest() throws Exception {
    // Arrange
    JacksonCompatibilityMode.Builder builder = new JacksonCompatibilityMode.Builder();

    // Act
    String actual = builder.toString();

    // Assert
    Assert.assertEquals(
        "Config{decodingMode=REFLECTION_MODE, encodingMode=REFLECTION_MODE, indentionStep=0, escapeUnicode=true, omitDefaultValue=false} => JacksonCompatibilityMode{}",
        actual);
    Assert.assertEquals(
        "Config{decodingMode=REFLECTION_MODE, encodingMode=REFLECTION_MODE, indentionStep=0, escapeUnicode=true, omitDefaultValue=false} => JacksonCompatibilityMode{}",
        builder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
