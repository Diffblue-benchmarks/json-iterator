package com.jsoniter.extra;

import com.jsoniter.extra.GsonCompatibilityMode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Builder_excludeFieldsWithoutExposeAnnotationTest_27_Test {
  @Test
  public void excludeFieldsWithoutExposeAnnotationTest() throws Exception {
    // Arrange
    GsonCompatibilityMode.Builder builder = new GsonCompatibilityMode.Builder();

    // Act
    GsonCompatibilityMode.Builder actual = builder.excludeFieldsWithoutExposeAnnotation();

    // Assert
    Assert.assertSame(builder, actual);
    Assert.assertNotNull(actual.toString());
    Assert.assertSame(actual, builder);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
