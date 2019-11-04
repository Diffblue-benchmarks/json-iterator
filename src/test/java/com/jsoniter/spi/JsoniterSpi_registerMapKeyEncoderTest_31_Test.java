package com.jsoniter.spi;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.spi.Encoder;
import com.jsoniter.spi.JsoniterSpi;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class JsoniterSpi_registerMapKeyEncoderTest_31_Test {
  @Test
  public void registerMapKeyEncoderTest() throws Exception {
    // Arrange
    ArrayType arrayType = (ArrayType) null;
    Encoder.StringDoubleEncoder stringDoubleEncoder = new Encoder.StringDoubleEncoder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    JsoniterSpi.registerMapKeyEncoder(arrayType, stringDoubleEncoder);
    Assert.assertEquals(null, arrayType);
    Assert.assertNotNull(stringDoubleEncoder.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
