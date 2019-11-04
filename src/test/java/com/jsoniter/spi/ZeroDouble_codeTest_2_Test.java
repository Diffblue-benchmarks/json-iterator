package com.jsoniter.spi;

import com.jsoniter.spi.OmitValue;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ZeroDouble_codeTest_2_Test {
  @Test
  public void codeTest() throws Exception {
    // Arrange
    OmitValue.ZeroDouble zeroDouble = new OmitValue.ZeroDouble();

    // Act
    String actual = zeroDouble.code();

    // Assert
    Assert.assertEquals("0 == %s", actual);
    String toStringResult = zeroDouble.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("0 == %s", zeroDouble.code());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
