package com.jsoniter.spi;

import com.jsoniter.spi.Encoder;
import com.jsoniter.spi.JsoniterSpi;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class JsoniterSpi_registerPropertyEncoderTest_32_Test {
  @Test
  public void registerPropertyEncoderTest() throws Exception {
    // Arrange
    Class resultClass = (Class) null;
    String property = "aaaaa";
    Encoder.StringDoubleEncoder stringDoubleEncoder = new Encoder.StringDoubleEncoder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    JsoniterSpi.registerPropertyEncoder(resultClass, property, stringDoubleEncoder);
    Assert.assertEquals(null, resultClass);
    Assert.assertNotNull(stringDoubleEncoder.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
