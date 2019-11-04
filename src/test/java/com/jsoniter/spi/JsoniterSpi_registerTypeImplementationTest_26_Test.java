package com.jsoniter.spi;

import com.jsoniter.spi.JsoniterSpi;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JsoniterSpi_registerTypeImplementationTest_26_Test {
  @Test
  public void registerTypeImplementationTest() throws Exception {
    // Arrange
    Class resultClass = (Class) null;
    Class resultClass1 = (Class) null;

    // Act
    JsoniterSpi.registerTypeImplementation(resultClass, resultClass1);

    // Assert
    Assert.assertEquals(null, resultClass);
    Assert.assertEquals(null, resultClass1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
