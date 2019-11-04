package com.jsoniter.spi;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.spi.Decoder;
import com.jsoniter.spi.EmptyExtension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EmptyExtension_createDecoderTest_5_Test {
  @Test
  public void createDecoderTest() throws Exception {
    // Arrange
    EmptyExtension emptyExtension = new EmptyExtension();
    String cacheKey = "aaaaa";
    ArrayType arrayType = (ArrayType) null;

    // Act
    Decoder actual = emptyExtension.createDecoder(cacheKey, arrayType);

    // Assert
    Assert.assertEquals(null, actual);
    Assert.assertEquals(null, arrayType);
    Assert.assertNotNull(emptyExtension.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
