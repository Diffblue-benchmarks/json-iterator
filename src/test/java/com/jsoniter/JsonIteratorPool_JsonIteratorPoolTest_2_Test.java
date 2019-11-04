package com.jsoniter;

import com.jsoniter.JsonIteratorPool;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JsonIteratorPool_JsonIteratorPoolTest_2_Test {
  @Test
  public void JsonIteratorPoolTest() throws Exception {
    // Arrange and Act
    JsonIteratorPool jsonIteratorPool = new JsonIteratorPool();

    // Assert
    Assert.assertNotNull(jsonIteratorPool.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
