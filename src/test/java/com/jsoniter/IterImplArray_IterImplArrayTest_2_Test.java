package com.jsoniter;

import com.jsoniter.IterImplArray;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class IterImplArray_IterImplArrayTest_2_Test {
  @Test
  public void IterImplArrayTest() throws Exception {
    // Arrange and Act
    IterImplArray iterImplArray = new IterImplArray();

    // Assert
    Assert.assertNotNull(iterImplArray.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
