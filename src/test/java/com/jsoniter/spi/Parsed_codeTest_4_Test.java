package com.jsoniter.spi;

import com.jsoniter.spi.OmitValue;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Parsed_codeTest_4_Test {
  @Test
  public void codeTest() throws Exception {
    // Arrange
    OmitValue.Parsed parsed = new OmitValue.Parsed("aaaaa", "aaaaa");

    // Act
    String actual = parsed.code();

    // Assert
    Assert.assertEquals("aaaaa", actual);
    Assert.assertEquals("aaaaa", parsed.code());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
