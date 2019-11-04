package com.jsoniter.extra;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.extra.GsonCompatibilityMode;
import com.jsoniter.spi.Decoder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class GsonCompatibilityMode_createDecoderTest_5_Test {
  @Test
  public void createDecoderTest() throws Exception {
    // Arrange
    GsonCompatibilityMode gsonCompatibilityMode = Whitebox.newInstance(GsonCompatibilityMode.class);
    String cacheKey = "aaaaa";
    ArrayType arrayType = (ArrayType) null;

    // Act
    Decoder actual = gsonCompatibilityMode.createDecoder(cacheKey, arrayType);

    // Assert
    Assert.assertEquals(null, actual);
    Assert.assertEquals(null, arrayType);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
