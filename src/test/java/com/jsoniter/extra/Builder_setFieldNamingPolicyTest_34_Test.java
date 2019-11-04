package com.jsoniter.extra;

import com.google.gson.FieldNamingPolicy;
import com.jsoniter.extra.GsonCompatibilityMode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Builder_setFieldNamingPolicyTest_34_Test {
  @Test
  public void setFieldNamingPolicyTest() throws Exception {
    // Arrange
    GsonCompatibilityMode.Builder builder = new GsonCompatibilityMode.Builder();
    FieldNamingPolicy namingConvention = FieldNamingPolicy.IDENTITY;

    // Act
    GsonCompatibilityMode.Builder actual = builder.setFieldNamingPolicy(namingConvention);

    // Assert
    Assert.assertSame(builder, actual);
    Assert.assertNotNull(actual.toString());
    Assert.assertSame(actual, builder);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
