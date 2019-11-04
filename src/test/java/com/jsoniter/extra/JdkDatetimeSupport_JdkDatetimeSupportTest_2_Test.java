package com.jsoniter.extra;

import com.jsoniter.extra.JdkDatetimeSupport;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JdkDatetimeSupport_JdkDatetimeSupportTest_2_Test {
  @Test
  public void JdkDatetimeSupportTest() throws Exception {
    // Arrange and Act
    new JdkDatetimeSupport();
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
