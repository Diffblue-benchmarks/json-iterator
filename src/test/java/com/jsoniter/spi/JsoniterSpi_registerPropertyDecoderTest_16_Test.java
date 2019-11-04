//package com.jsoniter.spi;
//
//import com.jsoniter.ReflectionObjectDecoder;
//import com.jsoniter.spi.JsoniterSpi;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//public class JsoniterSpi_registerPropertyDecoderTest_16_Test {
//  @Test
//  public void registerPropertyDecoderTest() throws Exception {
//    // Arrange
//    Class resultClass = (Class) null;
//    String property = "aaaaa";
//    ReflectionObjectDecoder.OnlyField onlyField = ((ReflectionObjectDecoder) null).new OnlyField();
//
//    // Act and Assert
//    thrown.expect(UnsupportedOperationException.class);
//    JsoniterSpi.registerPropertyDecoder(resultClass, property, onlyField);
//    Assert.assertEquals(null, resultClass);
//    Assert.assertNotNull(onlyField.toString());
//  }
//  @Rule
//  public Timeout timeout = new Timeout(10000);
//  @Rule
//  public ExpectedException thrown = ExpectedException.none();
//}
//