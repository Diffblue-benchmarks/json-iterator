package com.jsoniter;

import com.jsoniter.IterImplSkip;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class IterImplSkip_IterImplSkipTest_3_Test {
  @Test
  public void IterImplSkipTest() throws Exception {
    // Arrange and Act
    IterImplSkip iterImplSkip = new IterImplSkip();

    // Assert
    Assert.assertNotNull(iterImplSkip.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
