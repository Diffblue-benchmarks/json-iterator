//package com.jsoniter.spi;
//
//import com.fasterxml.jackson.databind.type.ArrayType;
//import com.jsoniter.ReflectionObjectDecoder;
//import com.jsoniter.spi.JsoniterSpi;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//public class JsoniterSpi_registerMapKeyDecoderTest_10_Test {
//  @Test
//  public void registerMapKeyDecoderTest() throws Exception {
//    // Arrange
//    ArrayType arrayType = (ArrayType) null;
//    ReflectionObjectDecoder.OnlyField mapKeyDecoder = ((ReflectionObjectDecoder) null).new OnlyField();
//
//    // Act and Assert
//    thrown.expect(UnsupportedOperationException.class);
//    JsoniterSpi.registerMapKeyDecoder(arrayType, mapKeyDecoder);
//    Assert.assertEquals(null, arrayType);
//  }
//  @Rule
//  public Timeout timeout = new Timeout(10000);
//  @Rule
//  public ExpectedException thrown = ExpectedException.none();
//}
//