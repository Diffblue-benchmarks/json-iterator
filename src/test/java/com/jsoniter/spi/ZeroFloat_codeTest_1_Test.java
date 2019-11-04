package com.jsoniter.spi;

import com.jsoniter.spi.OmitValue;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ZeroFloat_codeTest_1_Test {
  @Test
  public void codeTest() throws Exception {
    // Arrange
    OmitValue.ZeroFloat zeroFloat = new OmitValue.ZeroFloat();

    // Act
    String actual = zeroFloat.code();

    // Assert
    Assert.assertEquals("0 == %s", actual);
    String toStringResult = zeroFloat.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("0 == %s", zeroFloat.code());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
