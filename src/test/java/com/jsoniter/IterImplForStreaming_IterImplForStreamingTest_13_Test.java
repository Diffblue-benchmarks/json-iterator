package com.jsoniter;

import com.jsoniter.IterImplForStreaming;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class IterImplForStreaming_IterImplForStreamingTest_13_Test {
  @Test
  public void IterImplForStreamingTest() throws Exception {
    // Arrange and Act
    IterImplForStreaming iterImplForStreaming = new IterImplForStreaming();

    // Assert
    Assert.assertNotNull(iterImplForStreaming.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
