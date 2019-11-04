//package com.jsoniter.spi;
//
//import com.jsoniter.ReflectionObjectDecoder;
//import com.jsoniter.spi.JsoniterSpi;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.rules.Timeout;
//
//public class JsoniterSpi_addNewDecoderTest_6_Test {
//  @Test
//  public void addNewDecoderTest() throws Exception {
//    // Arrange
//    String cacheKey = "aaaaa";
//    ReflectionObjectDecoder.OnlyField onlyField = ((ReflectionObjectDecoder) null).new OnlyField();
//
//    // Act
//    JsoniterSpi.addNewDecoder(cacheKey, onlyField);
//
//    // Assert
//    Assert.assertNotNull(onlyField.toString());
//  }
//  @org.junit.Rule
//  public Timeout timeout = new Timeout(10000);
//}
//