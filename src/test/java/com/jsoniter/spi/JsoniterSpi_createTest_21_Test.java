package com.jsoniter.spi;

import com.jsoniter.spi.JsoniterSpi;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class JsoniterSpi_createTest_21_Test {
  @Test
  public void createTest() throws Exception {
    // Arrange
    Class resultClass = (Class) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    JsoniterSpi.create(resultClass);
    Assert.assertEquals(null, resultClass);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
