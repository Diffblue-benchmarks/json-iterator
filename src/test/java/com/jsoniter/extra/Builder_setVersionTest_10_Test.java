package com.jsoniter.extra;

import com.jsoniter.extra.GsonCompatibilityMode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Builder_setVersionTest_10_Test {
  @Test
  public void setVersionTest() throws Exception {
    // Arrange
    GsonCompatibilityMode.Builder builder = new GsonCompatibilityMode.Builder();
    double version = 1.0;

    // Act
    GsonCompatibilityMode.Builder actual = builder.setVersion(version);

    // Assert
    Assert.assertSame(builder, actual);
    Assert.assertNotNull(actual.toString());
    Assert.assertSame(actual, builder);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
