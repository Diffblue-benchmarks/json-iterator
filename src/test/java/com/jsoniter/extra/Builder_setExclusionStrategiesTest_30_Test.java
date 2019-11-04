package com.jsoniter.extra;

import com.google.gson.ExclusionStrategy;
import com.jsoniter.extra.GsonCompatibilityMode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class Builder_setExclusionStrategiesTest_30_Test {
  @Test
  public void setExclusionStrategiesTest() throws Exception {
    // Arrange
    GsonCompatibilityMode.Builder builder = new GsonCompatibilityMode.Builder();
    ExclusionStrategy exclusionStrategy = Whitebox.newInstance(ExclusionStrategy.class);
    ExclusionStrategy exclusionStrategy1 = Whitebox.newInstance(ExclusionStrategy.class);
    ExclusionStrategy exclusionStrategy2 = Whitebox.newInstance(ExclusionStrategy.class);
    ExclusionStrategy[] exclusionStrategyArray = new ExclusionStrategy[]{exclusionStrategy, exclusionStrategy1,
        exclusionStrategy2};

    // Act
    GsonCompatibilityMode.Builder actual = builder.setExclusionStrategies(exclusionStrategyArray);

    // Assert
    Assert.assertSame(builder, actual);
    Assert.assertNotNull(actual.toString());
    Assert.assertEquals(3, exclusionStrategyArray.length);
    Assert.assertSame(exclusionStrategy, exclusionStrategyArray[0]);
    Assert.assertSame(exclusionStrategy2, exclusionStrategyArray[2]);
    Assert.assertSame(exclusionStrategy1, exclusionStrategyArray[1]);
    Assert.assertSame(actual, builder);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
