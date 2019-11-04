package com.jsoniter.spi;

import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Config_builderTest_13_Test {
  @Test
  public void builderTest() throws Exception {
    // Arrange
    Config.Builder builder = new Config.Builder();
    Config config = new Config("aaaaa", builder);

    // Act
    Config.Builder actual = config.builder();

    // Assert
    Assert.assertSame(builder, actual);
    String toStringResult = config.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertSame(actual, config.builder());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
