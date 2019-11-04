package com.jsoniter.extra;

import com.jsoniter.extra.Base64Support;
import com.jsoniter.spi.JsonException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Base64Support_enableTest_1_Test {
//failed_pass   @Test
//  public void enableTest() throws Exception {
//    // Arrange, Act and Assert
//    thrown.expect(JsonException.class);
//    Base64Support.enable();
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
