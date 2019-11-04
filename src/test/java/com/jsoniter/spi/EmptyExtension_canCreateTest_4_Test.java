package com.jsoniter.spi;

import com.jsoniter.spi.EmptyExtension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EmptyExtension_canCreateTest_4_Test {
  @Test
  public void canCreateTest() throws Exception {
    // Arrange
    EmptyExtension emptyExtension = new EmptyExtension();
    Class resultClass = (Class) null;

    // Act
    boolean actual = emptyExtension.canCreate(resultClass);

    // Assert
    Assert.assertFalse(actual);
    Assert.assertEquals(null, resultClass);
    Assert.assertNotNull(emptyExtension.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
