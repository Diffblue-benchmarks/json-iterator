package com.jsoniter.spi;

import com.jsoniter.spi.OmitValue;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ZeroFloat_OmitValue$ZeroFloatTest_2_Test {
  @Test
  public void OmitValue$ZeroFloatTest() throws Exception {
    // Arrange and Act
    OmitValue.ZeroFloat zeroFloat = new OmitValue.ZeroFloat();

    // Assert
    String toStringResult = zeroFloat.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("0 == %s", zeroFloat.code());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
