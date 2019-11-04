package com.jsoniter.fuzzy;

import com.jsoniter.fuzzy.MaybeStringShortDecoder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MaybeStringShortDecoder_MaybeStringShortDecoderTest_1_Test {
  @Test
  public void MaybeStringShortDecoderTest() throws Exception {
    // Arrange and Act
    MaybeStringShortDecoder maybeStringShortDecoder = new MaybeStringShortDecoder();

    // Assert
    Assert.assertNotNull(maybeStringShortDecoder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
