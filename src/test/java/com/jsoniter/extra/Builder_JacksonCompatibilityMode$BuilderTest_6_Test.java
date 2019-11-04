package com.jsoniter.extra;

import com.jsoniter.extra.JacksonCompatibilityMode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Builder_JacksonCompatibilityMode$BuilderTest_6_Test {
  @Test
  public void JacksonCompatibilityMode$BuilderTest() throws Exception {
    // Arrange and Act
    JacksonCompatibilityMode.Builder builder = new JacksonCompatibilityMode.Builder();

    // Assert
    Assert.assertEquals(
        "Config{decodingMode=REFLECTION_MODE, encodingMode=REFLECTION_MODE, indentionStep=0, escapeUnicode=true, omitDefaultValue=false} => JacksonCompatibilityMode{}",
        builder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
