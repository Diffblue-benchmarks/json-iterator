package com.jsoniter.spi;

import com.jsoniter.spi.JsoniterSpi;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class JsoniterSpi_assignConfigNameTest_20_Test {
//failed_pass   @Test
//  public void assignConfigNameTest() throws Exception {
//    // Arrange
//    String obj = "aaaaa";
//
//    // Act and Assert
//    thrown.expect(UnsupportedOperationException.class);
//    JsoniterSpi.assignConfigName(obj);
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
