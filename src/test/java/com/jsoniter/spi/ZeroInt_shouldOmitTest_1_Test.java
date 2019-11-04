package com.jsoniter.spi;

import com.jsoniter.spi.OmitValue;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ZeroInt_shouldOmitTest_1_Test {
  @Test
  public void shouldOmitTest() throws Exception {
    // Arrange
    OmitValue.ZeroInt zeroInt = new OmitValue.ZeroInt();
    String val = "aaaaa";

    // Act and Assert
    thrown.expect(ClassCastException.class);
    zeroInt.shouldOmit(val);
    String toStringResult = zeroInt.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("0 == %s", zeroInt.code());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
