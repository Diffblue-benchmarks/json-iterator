package com.jsoniter.extra;

import com.jsoniter.extra.GsonCompatibilityMode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Builder_GsonCompatibilityMode$BuilderTest_16_Test {
  @Test
  public void GsonCompatibilityMode$BuilderTest() throws Exception {
    // Arrange and Act
    GsonCompatibilityMode.Builder builder = new GsonCompatibilityMode.Builder();

    // Assert
    Assert.assertNotNull(builder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
