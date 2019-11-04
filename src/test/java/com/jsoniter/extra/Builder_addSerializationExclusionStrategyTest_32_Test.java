package com.jsoniter.extra;

import com.google.gson.ExclusionStrategy;
import com.jsoniter.extra.GsonCompatibilityMode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class Builder_addSerializationExclusionStrategyTest_32_Test {
  @Test
  public void addSerializationExclusionStrategyTest() throws Exception {
    // Arrange
    GsonCompatibilityMode.Builder builder = new GsonCompatibilityMode.Builder();
    ExclusionStrategy exclusionStrategy = Whitebox.newInstance(ExclusionStrategy.class);

    // Act
    GsonCompatibilityMode.Builder actual = builder.addSerializationExclusionStrategy(exclusionStrategy);

    // Assert
    Assert.assertSame(builder, actual);
    Assert.assertNotNull(actual.toString());
    Assert.assertSame(actual, builder);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
