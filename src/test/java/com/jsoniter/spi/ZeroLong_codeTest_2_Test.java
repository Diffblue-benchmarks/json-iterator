package com.jsoniter.spi;

import com.jsoniter.spi.OmitValue;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ZeroLong_codeTest_2_Test {
  @Test
  public void codeTest() throws Exception {
    // Arrange
    OmitValue.ZeroLong zeroLong = new OmitValue.ZeroLong();

    // Act
    String actual = zeroLong.code();

    // Assert
    Assert.assertEquals("0 == %s", actual);
    Assert.assertEquals("0 == %s", zeroLong.code());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
