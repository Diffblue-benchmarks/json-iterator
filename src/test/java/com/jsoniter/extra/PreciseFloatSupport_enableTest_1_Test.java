package com.jsoniter.extra;

import com.jsoniter.extra.PreciseFloatSupport;
import com.jsoniter.spi.JsonException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class PreciseFloatSupport_enableTest_1_Test {
//failed_pass   @Test
//  public void enableTest() throws Exception {
//    // Arrange, Act and Assert
//    thrown.expect(JsonException.class);
//    PreciseFloatSupport.enable();
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
