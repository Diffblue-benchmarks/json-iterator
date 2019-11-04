package com.jsoniter.spi;

import com.jsoniter.spi.EmptyExtension;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class EmptyExtension_createTest_2_Test {
  @Test
  public void createTest() throws Exception {
    // Arrange
    EmptyExtension emptyExtension = new EmptyExtension();
    Class resultClass = (Class) null;

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    emptyExtension.create(resultClass);
    Assert.assertEquals(null, resultClass);
    Assert.assertNotNull(emptyExtension.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
