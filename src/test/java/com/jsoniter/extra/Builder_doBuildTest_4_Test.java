package com.jsoniter.extra;

import com.jsoniter.extra.GsonCompatibilityMode;
import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Builder_doBuildTest_4_Test {
//failed_compile   @Test
//  public void doBuildTest() throws Exception {
//    // Arrange
//    GsonCompatibilityMode.Builder builder = new GsonCompatibilityMode.Builder();
//    String configName = "aaaaa";
//
//    // Act
//    Config actual = builder.doBuild(configName);
//
//    // Assert
//    Assert.assertTrue(actual instanceof GsonCompatibilityMode);
//    String toStringResult = actual.toString();
//    GsonCompatibilityMode.Builder builderResult = actual.builder();
//    GsonCompatibilityMode.Builder builderResult1 = actual.builder();
//    Assert.assertNotNull(toStringResult);
//    Assert.assertSame(builder, builderResult1);
//    Assert.assertSame(builderResult1, builderResult);
//    Assert.assertNotNull(builderResult1.toString());
//    Assert.assertSame(builderResult1, builder);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
