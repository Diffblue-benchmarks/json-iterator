package com.jsoniter.extra;

import com.jsoniter.extra.GsonCompatibilityMode;
import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Builder_copyTest_17_Test {
  @Test
  public void copyTest() throws Exception {
    // Arrange
    GsonCompatibilityMode.Builder builder = new GsonCompatibilityMode.Builder();

    // Act and Assert
    thrown.expect(ClassCastException.class);
    builder.copy();
    Assert.assertNotNull(builder.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
