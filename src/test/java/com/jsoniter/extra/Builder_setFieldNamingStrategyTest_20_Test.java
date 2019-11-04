package com.jsoniter.extra;

import com.google.gson.FieldNamingStrategy;
import com.jsoniter.extra.GsonCompatibilityMode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class Builder_setFieldNamingStrategyTest_20_Test {
  @Test
  public void setFieldNamingStrategyTest() throws Exception {
    // Arrange
    GsonCompatibilityMode.Builder builder = new GsonCompatibilityMode.Builder();
    FieldNamingStrategy fieldNamingStrategy = Whitebox.newInstance(FieldNamingStrategy.class);

    // Act
    GsonCompatibilityMode.Builder actual = builder.setFieldNamingStrategy(fieldNamingStrategy);

    // Assert
    Assert.assertSame(builder, actual);
    Assert.assertNotNull(actual.toString());
    Assert.assertSame(actual, builder);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
