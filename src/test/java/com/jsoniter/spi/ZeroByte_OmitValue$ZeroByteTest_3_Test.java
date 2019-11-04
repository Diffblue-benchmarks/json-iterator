package com.jsoniter.spi;

import com.jsoniter.spi.OmitValue;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ZeroByte_OmitValue$ZeroByteTest_3_Test {
  @Test
  public void OmitValue$ZeroByteTest() throws Exception {
    // Arrange and Act
    OmitValue.ZeroByte zeroByte = new OmitValue.ZeroByte();

    // Assert
    Assert.assertEquals("0 == %s", zeroByte.code());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
