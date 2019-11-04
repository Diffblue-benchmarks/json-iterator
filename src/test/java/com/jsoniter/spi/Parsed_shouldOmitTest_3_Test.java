package com.jsoniter.spi;

import com.jsoniter.spi.OmitValue;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Parsed_shouldOmitTest_3_Test {
  @Test
  public void shouldOmitTest() throws Exception {
    // Arrange
    OmitValue.Parsed parsed = new OmitValue.Parsed("aaaaa", "aaaaa");
    String val = "aaaaa";

    // Act
    boolean actual = parsed.shouldOmit(val);

    // Assert
    Assert.assertTrue(actual);
    String toStringResult = parsed.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("aaaaa", parsed.code());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
