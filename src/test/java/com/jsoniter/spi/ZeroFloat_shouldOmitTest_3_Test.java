package com.jsoniter.spi;

import com.jsoniter.spi.OmitValue;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ZeroFloat_shouldOmitTest_3_Test {
  @Test
  public void shouldOmitTest() throws Exception {
    // Arrange
    OmitValue.ZeroFloat zeroFloat = new OmitValue.ZeroFloat();
    String val = "aaaaa";

    // Act and Assert
    thrown.expect(ClassCastException.class);
    zeroFloat.shouldOmit(val);
    String toStringResult = zeroFloat.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("0 == %s", zeroFloat.code());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
