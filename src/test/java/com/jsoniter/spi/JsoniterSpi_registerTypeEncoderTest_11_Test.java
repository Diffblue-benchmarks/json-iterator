package com.jsoniter.spi;

import com.jsoniter.spi.Encoder;
import com.jsoniter.spi.JsoniterSpi;
import com.jsoniter.spi.TypeLiteral;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class JsoniterSpi_registerTypeEncoderTest_11_Test {
  @Test
  public void registerTypeEncoderTest() throws Exception {
    // Arrange
    TypeLiteral typeLiteral = (TypeLiteral) null;
    Encoder.StringDoubleEncoder stringDoubleEncoder = new Encoder.StringDoubleEncoder();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    JsoniterSpi.registerTypeEncoder(typeLiteral, stringDoubleEncoder);
    Assert.assertEquals(null, typeLiteral);
    Assert.assertNotNull(stringDoubleEncoder.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
