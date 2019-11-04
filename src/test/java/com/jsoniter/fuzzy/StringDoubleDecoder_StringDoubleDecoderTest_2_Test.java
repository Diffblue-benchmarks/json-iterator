package com.jsoniter.fuzzy;

import com.jsoniter.fuzzy.StringDoubleDecoder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StringDoubleDecoder_StringDoubleDecoderTest_2_Test {
  @Test
  public void StringDoubleDecoderTest() throws Exception {
    // Arrange and Act
    StringDoubleDecoder stringDoubleDecoder = new StringDoubleDecoder();

    // Assert
    Assert.assertNotNull(stringDoubleDecoder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
