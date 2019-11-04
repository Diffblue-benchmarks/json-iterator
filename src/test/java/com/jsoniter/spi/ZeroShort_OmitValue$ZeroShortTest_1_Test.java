package com.jsoniter.spi;

import com.jsoniter.spi.OmitValue;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ZeroShort_OmitValue$ZeroShortTest_1_Test {
  @Test
  public void OmitValue$ZeroShortTest() throws Exception {
    // Arrange and Act
    OmitValue.ZeroShort zeroShort = new OmitValue.ZeroShort();

    // Assert
    String toStringResult = zeroShort.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("0 == %s", zeroShort.code());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
