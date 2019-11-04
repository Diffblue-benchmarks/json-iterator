package com.jsoniter.extra;

import com.jsoniter.extra.Base64FloatSupport;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Base64FloatSupport_enableDecodersTest_3_Test {
  @Test
  public void enableDecodersTest() throws Exception {
    // Arrange and Act
    Base64FloatSupport.enableDecoders();
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
