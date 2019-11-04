package com.jsoniter.fuzzy;

import com.jsoniter.fuzzy.StringShortDecoder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StringShortDecoder_StringShortDecoderTest_2_Test {
  @Test
  public void StringShortDecoderTest() throws Exception {
    // Arrange and Act
    StringShortDecoder stringShortDecoder = new StringShortDecoder();

    // Assert
    Assert.assertNotNull(stringShortDecoder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
