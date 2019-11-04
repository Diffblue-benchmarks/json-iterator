package com.jsoniter;

import com.jsoniter.IterImplString;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class IterImplString_IterImplStringTest_1_Test {
  @Test
  public void IterImplStringTest() throws Exception {
    // Arrange and Act
    IterImplString iterImplString = new IterImplString();

    // Assert
    Assert.assertNotNull(iterImplString.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
