package com.jsoniter.fuzzy;

import com.jsoniter.fuzzy.StringFloatDecoder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StringFloatDecoder_StringFloatDecoderTest_2_Test {
  @Test
  public void StringFloatDecoderTest() throws Exception {
    // Arrange and Act
    StringFloatDecoder stringFloatDecoder = new StringFloatDecoder();

    // Assert
    Assert.assertNotNull(stringFloatDecoder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
