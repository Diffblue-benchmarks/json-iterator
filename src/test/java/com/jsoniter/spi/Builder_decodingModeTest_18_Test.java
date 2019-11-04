package com.jsoniter.spi;

import com.jsoniter.spi.Config;
import com.jsoniter.spi.DecodingMode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Builder_decodingModeTest_18_Test {
  @Test
  public void decodingModeTest() throws Exception {
    // Arrange
    Config.Builder builder = new Config.Builder();
    DecodingMode decodingMode = DecodingMode.DYNAMIC_MODE_AND_MATCH_FIELD_WITH_HASH;

    // Act
    Config.Builder actual = builder.decodingMode(decodingMode);

    // Assert
    Assert.assertSame(builder, actual);
    Assert.assertSame(actual, builder);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
