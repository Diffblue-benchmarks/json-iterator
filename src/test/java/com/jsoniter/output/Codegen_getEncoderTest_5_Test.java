package com.jsoniter.output;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.output.Codegen;
import com.jsoniter.spi.Encoder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Codegen_getEncoderTest_5_Test {
  @Test
  public void getEncoderTest() throws Exception {
    // Arrange
    String cacheKey = "aaaaa";
    ArrayType arrayType = (ArrayType) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    Codegen.getEncoder(cacheKey, arrayType);
    Assert.assertEquals(null, arrayType);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}