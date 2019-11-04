//package com.jsoniter.spi;
//
//import com.jsoniter.ReflectionObjectDecoder;
//import com.jsoniter.spi.JsoniterSpi;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.rules.Timeout;
//
//public class JsoniterSpi_addNewMapDecoderTest_19_Test {
//  @Test
//  public void addNewMapDecoderTest() throws Exception {
//    // Arrange
//    String cacheKey = "aaaaa";
//    ReflectionObjectDecoder.OnlyField onlyField = ((ReflectionObjectDecoder) null).new OnlyField();
//
//    // Act
//    JsoniterSpi.addNewMapDecoder(cacheKey, onlyField);
//
//    // Assert
//    Assert.assertNotNull(onlyField.toString());
//  }
//  @org.junit.Rule
//  public Timeout timeout = new Timeout(10000);
//}
//