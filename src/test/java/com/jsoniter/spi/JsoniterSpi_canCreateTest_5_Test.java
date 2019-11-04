package com.jsoniter.spi;

import com.jsoniter.spi.JsoniterSpi;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JsoniterSpi_canCreateTest_5_Test {
  @Test
  public void canCreateTest() throws Exception {
    // Arrange
    Class resultClass = (Class) null;

    // Act
    boolean actual = JsoniterSpi.canCreate(resultClass);

    // Assert
    Assert.assertFalse(actual);
    Assert.assertEquals(null, resultClass);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
