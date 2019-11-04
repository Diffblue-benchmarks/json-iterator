package com.jsoniter.extra;

import com.jsoniter.extra.JdkDatetimeSupport;
import com.jsoniter.spi.JsonException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class JdkDatetimeSupport_enableTest_1_Test {
//failed_pass   @Test
//  public void enableTest() throws Exception {
//    // Arrange
//    String pattern = "aaaaa";
//
//    // Act and Assert
//    thrown.expect(JsonException.class);
//    JdkDatetimeSupport.enable(pattern);
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
