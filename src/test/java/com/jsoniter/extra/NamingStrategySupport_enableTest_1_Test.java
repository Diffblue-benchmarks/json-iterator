package com.jsoniter.extra;

import com.jsoniter.extra.NamingStrategySupport;
import com.jsoniter.spi.JsonException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class NamingStrategySupport_enableTest_1_Test {
//failed_pass   @Test
//  public void enableTest() throws Exception {
//    // Arrange
//    NamingStrategySupport.NamingStrategy namingStrategy = Whitebox
//        .newInstance(NamingStrategySupport.NamingStrategy.class);
//
//    // Act and Assert
//    thrown.expect(JsonException.class);
//    NamingStrategySupport.enable(namingStrategy);
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
