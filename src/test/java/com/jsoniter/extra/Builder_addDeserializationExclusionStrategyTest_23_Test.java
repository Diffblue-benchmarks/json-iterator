package com.jsoniter.extra;

import com.google.gson.ExclusionStrategy;
import com.jsoniter.extra.GsonCompatibilityMode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class Builder_addDeserializationExclusionStrategyTest_23_Test {
  @Test
  public void addDeserializationExclusionStrategyTest() throws Exception {
    // Arrange
    GsonCompatibilityMode.Builder builder = new GsonCompatibilityMode.Builder();
    ExclusionStrategy exclusionStrategy = Whitebox.newInstance(ExclusionStrategy.class);

    // Act
    GsonCompatibilityMode.Builder actual = builder.addDeserializationExclusionStrategy(exclusionStrategy);

    // Assert
    Assert.assertSame(builder, actual);
    Assert.assertNotNull(actual.toString());
    Assert.assertSame(actual, builder);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
