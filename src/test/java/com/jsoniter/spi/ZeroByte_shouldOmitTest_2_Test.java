package com.jsoniter.spi;

import com.jsoniter.spi.OmitValue;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ZeroByte_shouldOmitTest_2_Test {
  @Test
  public void shouldOmitTest() throws Exception {
    // Arrange
    OmitValue.ZeroByte zeroByte = new OmitValue.ZeroByte();
    String val = "aaaaa";

    // Act and Assert
    thrown.expect(ClassCastException.class);
    zeroByte.shouldOmit(val);
    String toStringResult = zeroByte.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("0 == %s", zeroByte.code());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
