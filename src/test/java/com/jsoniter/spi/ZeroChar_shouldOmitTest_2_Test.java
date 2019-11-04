package com.jsoniter.spi;

import com.jsoniter.spi.OmitValue;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ZeroChar_shouldOmitTest_2_Test {
  @Test
  public void shouldOmitTest() throws Exception {
    // Arrange
    OmitValue.ZeroChar zeroChar = new OmitValue.ZeroChar();
    String val = "aaaaa";

    // Act and Assert
    thrown.expect(ClassCastException.class);
    zeroChar.shouldOmit(val);
    Assert.assertEquals("0 == %s", zeroChar.code());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
