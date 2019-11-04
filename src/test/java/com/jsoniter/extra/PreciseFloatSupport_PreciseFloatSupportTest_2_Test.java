package com.jsoniter.extra;

import com.jsoniter.extra.PreciseFloatSupport;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PreciseFloatSupport_PreciseFloatSupportTest_2_Test {
  @Test
  public void PreciseFloatSupportTest() throws Exception {
    // Arrange and Act
    PreciseFloatSupport preciseFloatSupport = new PreciseFloatSupport();

    // Assert
    Assert.assertNotNull(preciseFloatSupport.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
