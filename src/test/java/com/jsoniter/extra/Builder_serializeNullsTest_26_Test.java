package com.jsoniter.extra;

import com.jsoniter.extra.GsonCompatibilityMode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Builder_serializeNullsTest_26_Test {
  @Test
  public void serializeNullsTest() throws Exception {
    // Arrange
    GsonCompatibilityMode.Builder builder = new GsonCompatibilityMode.Builder();

    // Act
    GsonCompatibilityMode.Builder actual = builder.serializeNulls();

    // Assert
    Assert.assertSame(builder, actual);
    Assert.assertSame(actual, builder);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
