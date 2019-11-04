package com.jsoniter.extra;

import com.jsoniter.extra.GsonCompatibilityMode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Builder_setDateFormatTest_1_Test {
  @Test
  public void setDateFormatTest() throws Exception {
    // Arrange
    GsonCompatibilityMode.Builder builder = new GsonCompatibilityMode.Builder();
    int dateStyle = 1;
    int timeStyle = 1;

    // Act
    GsonCompatibilityMode.Builder actual = builder.setDateFormat(dateStyle, timeStyle);

    // Assert
    Assert.assertSame(builder, actual);
    Assert.assertSame(actual, builder);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
