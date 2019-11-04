package com.jsoniter.spi;

import com.jsoniter.spi.Extension;
import com.jsoniter.spi.JsoniterSpi;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JsoniterSpi_getObjectFactoryTest_29_Test {
  @Test
  public void getObjectFactoryTest() throws Exception {
    // Arrange
    Class resultClass = (Class) null;

    // Act
    Extension actual = JsoniterSpi.getObjectFactory(resultClass);

    // Assert
    Assert.assertEquals(null, actual);
    Assert.assertEquals(null, resultClass);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
