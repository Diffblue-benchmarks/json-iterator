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
//public class JsoniterSpi_registerTypeDecoderTest_24_Test {
//  @Test
//  public void registerTypeDecoderTest() throws Exception {
//    // Arrange
//    TypeLiteral typeLiteral = (TypeLiteral) null;
//    ReflectionObjectDecoder.OnlyField decoder = ((ReflectionObjectDecoder) null).new OnlyField();
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    JsoniterSpi.registerTypeDecoder(typeLiteral, decoder);
//    Assert.assertEquals(null, typeLiteral);
//  }
//  @Rule
//  public Timeout timeout = new Timeout(10000);
//  @Rule
//  public ExpectedException thrown = ExpectedException.none();
//}
//