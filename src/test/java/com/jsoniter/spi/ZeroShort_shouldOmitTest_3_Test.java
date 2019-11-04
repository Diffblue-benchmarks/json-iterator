package com.jsoniter.spi;

import com.jsoniter.spi.OmitValue;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ZeroShort_shouldOmitTest_3_Test {
  @Test
  public void shouldOmitTest() throws Exception {
    // Arrange
    OmitValue.ZeroShort zeroShort = new OmitValue.ZeroShort();
    String val = "aaaaa";

    // Act and Assert
    thrown.expect(ClassCastException.class);
    zeroShort.shouldOmit(val);
    String toStringResult = zeroShort.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("0 == %s", zeroShort.code());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
