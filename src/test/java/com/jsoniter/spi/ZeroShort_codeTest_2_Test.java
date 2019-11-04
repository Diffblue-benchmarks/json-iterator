package com.jsoniter.spi;

import com.jsoniter.spi.OmitValue;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ZeroShort_codeTest_2_Test {
  @Test
  public void codeTest() throws Exception {
    // Arrange
    OmitValue.ZeroShort zeroShort = new OmitValue.ZeroShort();

    // Act
    String actual = zeroShort.code();

    // Assert
    Assert.assertEquals("0 == %s", actual);
    String toStringResult = zeroShort.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("0 == %s", zeroShort.code());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
