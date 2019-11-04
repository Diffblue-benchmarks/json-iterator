package com.jsoniter.spi;

import com.jsoniter.spi.OmitValue;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ZeroDouble_shouldOmitTest_1_Test {
  @Test
  public void shouldOmitTest() throws Exception {
    // Arrange
    OmitValue.ZeroDouble zeroDouble = new OmitValue.ZeroDouble();
    String val = "aaaaa";

    // Act and Assert
    thrown.expect(ClassCastException.class);
    zeroDouble.shouldOmit(val);
    String toStringResult = zeroDouble.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("0 == %s", zeroDouble.code());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
