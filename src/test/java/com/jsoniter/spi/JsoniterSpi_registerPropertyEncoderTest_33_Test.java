package com.jsoniter.spi;

import com.jsoniter.spi.Encoder;
import com.jsoniter.spi.JsoniterSpi;
import com.jsoniter.spi.TypeLiteral;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class JsoniterSpi_registerPropertyEncoderTest_33_Test {
  @Test
  public void registerPropertyEncoderTest() throws Exception {
    // Arrange
    TypeLiteral typeLiteral = (TypeLiteral) null;
    String property = "aaaaa";
    Encoder.StringDoubleEncoder encoder = new Encoder.StringDoubleEncoder();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    JsoniterSpi.registerPropertyEncoder(typeLiteral, property, encoder);
    Assert.assertEquals(null, typeLiteral);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
