package com.jsoniter.fuzzy;

import com.jsoniter.fuzzy.MaybeStringIntDecoder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MaybeStringIntDecoder_MaybeStringIntDecoderTest_1_Test {
  @Test
  public void MaybeStringIntDecoderTest() throws Exception {
    // Arrange and Act
    MaybeStringIntDecoder maybeStringIntDecoder = new MaybeStringIntDecoder();

    // Assert
    Assert.assertNotNull(maybeStringIntDecoder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
