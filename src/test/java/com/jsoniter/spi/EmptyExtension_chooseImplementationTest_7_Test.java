package com.jsoniter.spi;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.spi.EmptyExtension;
import java.lang.reflect.Type;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EmptyExtension_chooseImplementationTest_7_Test {
  @Test
  public void chooseImplementationTest() throws Exception {
    // Arrange
    EmptyExtension emptyExtension = new EmptyExtension();
    ArrayType arrayType = (ArrayType) null;

    // Act
    Type actual = emptyExtension.chooseImplementation(arrayType);

    // Assert
    Assert.assertEquals(null, actual);
    Assert.assertEquals(null, arrayType);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
