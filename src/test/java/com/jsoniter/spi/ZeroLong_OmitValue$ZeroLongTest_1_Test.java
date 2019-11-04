package com.jsoniter.spi;

import com.jsoniter.spi.OmitValue;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ZeroLong_OmitValue$ZeroLongTest_1_Test {
  @Test
  public void OmitValue$ZeroLongTest() throws Exception {
    // Arrange and Act
    OmitValue.ZeroLong zeroLong = new OmitValue.ZeroLong();

    // Assert
    String toStringResult = zeroLong.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("0 == %s", zeroLong.code());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
