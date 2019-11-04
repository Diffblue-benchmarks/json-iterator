package com.jsoniter;

import com.jsoniter.IterImplForStreaming;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class numberChars_IterImplForStreaming$numberCharsTest_1_Test {
  @Test
  public void IterImplForStreaming$numberCharsTest() throws Exception {
    // Arrange and Act
    IterImplForStreaming.numberChars numberChars = new IterImplForStreaming.numberChars();

    // Assert
    Assert.assertNotNull(numberChars.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
