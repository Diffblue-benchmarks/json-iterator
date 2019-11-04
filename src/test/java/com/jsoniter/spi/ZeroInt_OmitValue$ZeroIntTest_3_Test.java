package com.jsoniter.spi;

import com.jsoniter.spi.OmitValue;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ZeroInt_OmitValue$ZeroIntTest_3_Test {
  @Test
  public void OmitValue$ZeroIntTest() throws Exception {
    // Arrange and Act
    OmitValue.ZeroInt zeroInt = new OmitValue.ZeroInt();

    // Assert
    Assert.assertEquals("0 == %s", zeroInt.code());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
