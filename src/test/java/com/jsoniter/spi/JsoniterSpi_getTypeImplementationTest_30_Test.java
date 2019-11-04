package com.jsoniter.spi;

import com.jsoniter.spi.JsoniterSpi;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JsoniterSpi_getTypeImplementationTest_30_Test {
  @Test
  public void getTypeImplementationTest() throws Exception {
    // Arrange
    Class resultClass = (Class) null;

    // Act
    Class actual = JsoniterSpi.getTypeImplementation(resultClass);

    // Assert
    Assert.assertEquals(null, actual);
    Assert.assertEquals(null, resultClass);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
