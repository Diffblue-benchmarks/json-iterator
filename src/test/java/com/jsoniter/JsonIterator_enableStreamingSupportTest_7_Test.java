package com.jsoniter;

import com.jsoniter.JsonIterator;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JsonIterator_enableStreamingSupportTest_7_Test {
  @Test
  public void enableStreamingSupportTest() throws Exception {
    // Arrange and Act
    JsonIterator.enableStreamingSupport();
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
