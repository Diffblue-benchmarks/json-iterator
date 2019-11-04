package com.jsoniter.spi;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.spi.GenericsHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class GenericsHelper_isSameClassTest_4_Test {
  @Test
  public void isSameClassTest() throws Exception {
    // Arrange
    ArrayType arrayType = (ArrayType) null;
    Class resultClass = (Class) null;

    // Act
    boolean actual = GenericsHelper.isSameClass(arrayType, resultClass);

    // Assert
    Assert.assertTrue(actual);
    Assert.assertEquals(null, arrayType);
    Assert.assertEquals(null, resultClass);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
