package com.jsoniter.spi;

import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Builder_escapeUnicodeTest_19_Test {
  @Test
  public void escapeUnicodeTest() throws Exception {
    // Arrange
    Config.Builder builder = new Config.Builder();
    boolean escapeUnicode = true;

    // Act
    Config.Builder actual = builder.escapeUnicode(escapeUnicode);

    // Assert
    Assert.assertSame(builder, actual);
    Assert.assertSame(actual, builder);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
