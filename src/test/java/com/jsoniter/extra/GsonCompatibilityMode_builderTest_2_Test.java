package com.jsoniter.extra;

import com.jsoniter.extra.GsonCompatibilityMode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class GsonCompatibilityMode_builderTest_2_Test {
  @Test
  public void builderTest() throws Exception {
    // Arrange
    GsonCompatibilityMode gsonCompatibilityMode = Whitebox.newInstance(GsonCompatibilityMode.class);

    // Act
    GsonCompatibilityMode.Builder actual = gsonCompatibilityMode.builder();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
