package com.jsoniter.spi;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.spi.TypeLiteral;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TypeLiteral_createTest_4_Test {
  @Test
  public void createTest() throws Exception {
    // Arrange
    ArrayType arrayType = (ArrayType) null;

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    TypeLiteral.create(arrayType);
    Assert.assertEquals(null, arrayType);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
