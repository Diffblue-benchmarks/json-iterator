//package com.jsoniter.spi;
//
//import com.jsoniter.ReflectionObjectDecoder;
//import com.jsoniter.spi.JsoniterSpi;
//import com.jsoniter.spi.TypeLiteral;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//public class JsoniterSpi_registerPropertyDecoderTest_25_Test {
//  @Test
//  public void registerPropertyDecoderTest() throws Exception {
//    // Arrange
//    TypeLiteral typeLiteral = (TypeLiteral) null;
//    String property = "aaaaa";
//    ReflectionObjectDecoder.OnlyField onlyField = ((ReflectionObjectDecoder) null).new OnlyField();
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    JsoniterSpi.registerPropertyDecoder(typeLiteral, property, onlyField);
//    Assert.assertEquals(null, typeLiteral);
//    Assert.assertNotNull(onlyField.toString());
//  }
//  @Rule
//  public Timeout timeout = new Timeout(10000);
//  @Rule
//  public ExpectedException thrown = ExpectedException.none();
//}
//