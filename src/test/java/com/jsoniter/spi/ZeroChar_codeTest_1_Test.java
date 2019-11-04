package com.jsoniter.spi;

import com.jsoniter.spi.OmitValue;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ZeroChar_codeTest_1_Test {
  @Test
  public void codeTest() throws Exception {
    // Arrange
    OmitValue.ZeroChar zeroChar = new OmitValue.ZeroChar();

    // Act
    String actual = zeroChar.code();

    // Assert
    Assert.assertEquals("0 == %s", actual);
    String toStringResult = zeroChar.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("0 == %s", zeroChar.code());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
