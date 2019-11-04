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
//public class JsoniterSpi_registerTypeDecoderTest_17_Test {
//  @Test
//  public void registerTypeDecoderTest() throws Exception {
//    // Arrange
//    Class resultClass = (Class) null;
//    ReflectionObjectDecoder.OnlyField onlyField = ((ReflectionObjectDecoder) null).new OnlyField();
//
//    // Act and Assert
//    thrown.expect(UnsupportedOperationException.class);
//    JsoniterSpi.registerTypeDecoder(resultClass, onlyField);
//    Assert.assertEquals(null, resultClass);
//    Assert.assertNotNull(onlyField.toString());
//  }
//  @Rule
//  public Timeout timeout = new Timeout(10000);
//  @Rule
//  public ExpectedException thrown = ExpectedException.none();
//}
//