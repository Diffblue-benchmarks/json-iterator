package com.jsoniter.spi;

import com.jsoniter.spi.OmitValue;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ZeroDouble_OmitValue$ZeroDoubleTest_3_Test {
  @Test
  public void OmitValue$ZeroDoubleTest() throws Exception {
    // Arrange and Act
    OmitValue.ZeroDouble zeroDouble = new OmitValue.ZeroDouble();

    // Assert
    Assert.assertEquals("0 == %s", zeroDouble.code());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
