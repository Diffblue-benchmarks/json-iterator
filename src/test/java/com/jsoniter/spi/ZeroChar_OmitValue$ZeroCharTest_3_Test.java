package com.jsoniter.spi;

import com.jsoniter.spi.OmitValue;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ZeroChar_OmitValue$ZeroCharTest_3_Test {
  @Test
  public void OmitValue$ZeroCharTest() throws Exception {
    // Arrange and Act
    OmitValue.ZeroChar zeroChar = new OmitValue.ZeroChar();

    // Assert
    Assert.assertEquals("0 == %s", zeroChar.code());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
