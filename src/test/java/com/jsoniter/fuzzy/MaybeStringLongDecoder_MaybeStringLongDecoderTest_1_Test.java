package com.jsoniter.fuzzy;

import com.jsoniter.fuzzy.MaybeStringLongDecoder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MaybeStringLongDecoder_MaybeStringLongDecoderTest_1_Test {
  @Test
  public void MaybeStringLongDecoderTest() throws Exception {
    // Arrange and Act
    MaybeStringLongDecoder maybeStringLongDecoder = new MaybeStringLongDecoder();

    // Assert
    Assert.assertNotNull(maybeStringLongDecoder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
