package com.jsoniter.fuzzy;

import com.jsoniter.fuzzy.StringIntDecoder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StringIntDecoder_StringIntDecoderTest_2_Test {
  @Test
  public void StringIntDecoderTest() throws Exception {
    // Arrange and Act
    StringIntDecoder stringIntDecoder = new StringIntDecoder();

    // Assert
    Assert.assertNotNull(stringIntDecoder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
