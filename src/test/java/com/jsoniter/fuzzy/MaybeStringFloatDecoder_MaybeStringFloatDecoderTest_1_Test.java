package com.jsoniter.fuzzy;

import com.jsoniter.fuzzy.MaybeStringFloatDecoder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MaybeStringFloatDecoder_MaybeStringFloatDecoderTest_1_Test {
  @Test
  public void MaybeStringFloatDecoderTest() throws Exception {
    // Arrange and Act
    MaybeStringFloatDecoder maybeStringFloatDecoder = new MaybeStringFloatDecoder();

    // Assert
    Assert.assertNotNull(maybeStringFloatDecoder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
