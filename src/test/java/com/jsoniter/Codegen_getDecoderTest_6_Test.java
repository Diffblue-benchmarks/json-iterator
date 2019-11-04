package com.jsoniter;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.Codegen;
import com.jsoniter.ReflectionObjectDecoder;
import com.jsoniter.spi.Decoder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Codegen_getDecoderTest_6_Test {
//failed_run   @Test
//  public void getDecoderTest() throws Exception {
//    // Arrange
//    String cacheKey = "aaaaa";
//    ArrayType arrayType = (ArrayType) null;
//
//    // Act
//    Decoder actual = Codegen.getDecoder(cacheKey, arrayType);
//
//    // Assert
//    Assert.assertTrue(actual instanceof ReflectionObjectDecoder.OnlyField);
//    Assert.assertNotNull(((ReflectionObjectDecoder.OnlyField) actual).toString());
//    Assert.assertEquals(null, arrayType);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
