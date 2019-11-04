package com.jsoniter.extra;

import com.jsoniter.extra.Base64FloatSupport;
import com.jsoniter.spi.JsonException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Base64FloatSupport_enableEncodersAndDecodersTest_2_Test {
//failed_pass   @Test
//  public void enableEncodersAndDecodersTest() throws Exception {
//    // Arrange, Act and Assert
//    thrown.expect(JsonException.class);
//    Base64FloatSupport.enableEncodersAndDecoders();
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
