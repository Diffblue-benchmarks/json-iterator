package com.jsoniter.spi;

import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Builder_equalsTest_35_Test {
  @Test
  public void equalsTest() throws Exception {
    // Arrange
    Config.Builder builder = new Config.Builder();
    String o = "aaaaa";

    // Act
    boolean actual = builder.equals(o);

    // Assert
    Assert.assertFalse(actual);
    Assert.assertEquals(
        "Config{decodingMode=REFLECTION_MODE, encodingMode=REFLECTION_MODE, indentionStep=0, escapeUnicode=true, omitDefaultValue=false}",
        builder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
