package com.jsoniter;

import com.jsoniter.IterImplNumber;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class IterImplNumber_IterImplNumberTest_3_Test {
  @Test
  public void IterImplNumberTest() throws Exception {
    // Arrange and Act
    IterImplNumber iterImplNumber = new IterImplNumber();

    // Assert
    Assert.assertNotNull(iterImplNumber.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
