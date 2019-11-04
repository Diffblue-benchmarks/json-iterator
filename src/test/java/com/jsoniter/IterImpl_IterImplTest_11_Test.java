package com.jsoniter;

import com.jsoniter.IterImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class IterImpl_IterImplTest_11_Test {
  @Test
  public void IterImplTest() throws Exception {
    // Arrange and Act
    IterImpl iterImpl = new IterImpl();

    // Assert
    Assert.assertNotNull(iterImpl.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
