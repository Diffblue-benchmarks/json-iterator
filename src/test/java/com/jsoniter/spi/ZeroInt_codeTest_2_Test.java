package com.jsoniter.spi;

import com.jsoniter.spi.OmitValue;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ZeroInt_codeTest_2_Test {
  @Test
  public void codeTest() throws Exception {
    // Arrange
    OmitValue.ZeroInt zeroInt = new OmitValue.ZeroInt();

    // Act
    String actual = zeroInt.code();

    // Assert
    Assert.assertEquals("0 == %s", actual);
    String toStringResult = zeroInt.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("0 == %s", zeroInt.code());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
