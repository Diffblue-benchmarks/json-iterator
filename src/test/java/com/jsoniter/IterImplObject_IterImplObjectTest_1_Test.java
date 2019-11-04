package com.jsoniter;

import com.jsoniter.IterImplObject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class IterImplObject_IterImplObjectTest_1_Test {
  @Test
  public void IterImplObjectTest() throws Exception {
    // Arrange and Act
    IterImplObject iterImplObject = new IterImplObject();

    // Assert
    Assert.assertNotNull(iterImplObject.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
