package com.jsoniter;

import com.jsoniter.JsonIterator;
import com.jsoniter.spi.DecodingMode;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class JsonIterator_setModeTest_12_Test {
//failed_pass   @Test
//  public void setModeTest() throws Exception {
//    // Arrange
//    DecodingMode mode = DecodingMode.DYNAMIC_MODE_AND_MATCH_FIELD_WITH_HASH;
//
//    // Act and Assert
//    thrown.expect(UnsupportedOperationException.class);
//    JsonIterator.setMode(mode);
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
