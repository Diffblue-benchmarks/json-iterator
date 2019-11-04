package com.jsoniter.spi;

import com.jsoniter.spi.OmitValue;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Parsed_OmitValue$ParsedTest_1_Test {
  @Test
  public void OmitValue$ParsedTest() throws Exception {
    // Arrange
    String defaultValue = "aaaaa";
    String code = "aaaaa";

    // Act
    OmitValue.Parsed parsed = new OmitValue.Parsed(defaultValue, code);

    // Assert
    String toStringResult = parsed.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("aaaaa", parsed.code());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
