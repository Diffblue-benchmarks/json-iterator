package com.jsoniter.extra;

import com.jsoniter.extra.JacksonCompatibilityMode;
import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Builder_doBuildTest_11_Test {
//failed_compile   @Test
//  public void doBuildTest() throws Exception {
//    // Arrange
//    JacksonCompatibilityMode.Builder builder = new JacksonCompatibilityMode.Builder();
//    String configName = "aaaaa";
//
//    // Act
//    Config actual = builder.doBuild(configName);
//
//    // Assert
//    Assert.assertTrue(actual instanceof JacksonCompatibilityMode);
//    String toStringResult = actual.toString();
//    Config.Builder builderResult = actual.builder();
//    Assert.assertNotNull(toStringResult);
//    Assert.assertSame(builder, builderResult);
//    Assert.assertTrue(builderResult instanceof JacksonCompatibilityMode.Builder);
//    Assert.assertSame(builder, builderResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
