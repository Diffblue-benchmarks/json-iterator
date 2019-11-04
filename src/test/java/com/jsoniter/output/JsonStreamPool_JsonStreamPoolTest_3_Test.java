package com.jsoniter.output;

import com.jsoniter.output.JsonStreamPool;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JsonStreamPool_JsonStreamPoolTest_3_Test {
  @Test
  public void JsonStreamPoolTest() throws Exception {
    // Arrange and Act
    JsonStreamPool jsonStreamPool = new JsonStreamPool();

    // Assert
    Assert.assertNotNull(jsonStreamPool.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
