package com.jsoniter.fuzzy;

import com.jsoniter.fuzzy.StringLongDecoder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StringLongDecoder_StringLongDecoderTest_1_Test {
  @Test
  public void StringLongDecoderTest() throws Exception {
    // Arrange and Act
    StringLongDecoder stringLongDecoder = new StringLongDecoder();

    // Assert
    Assert.assertNotNull(stringLongDecoder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
