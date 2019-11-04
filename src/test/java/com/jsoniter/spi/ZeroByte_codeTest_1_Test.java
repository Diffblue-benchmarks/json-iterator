package com.jsoniter.spi;

import com.jsoniter.spi.OmitValue;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ZeroByte_codeTest_1_Test {
  @Test
  public void codeTest() throws Exception {
    // Arrange
    OmitValue.ZeroByte zeroByte = new OmitValue.ZeroByte();

    // Act
    String actual = zeroByte.code();

    // Assert
    Assert.assertEquals("0 == %s", actual);
    String toStringResult = zeroByte.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("0 == %s", zeroByte.code());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
