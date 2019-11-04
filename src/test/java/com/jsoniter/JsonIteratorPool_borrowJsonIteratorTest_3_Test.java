package com.jsoniter;

import com.jsoniter.JsonIterator;
import com.jsoniter.JsonIteratorPool;
import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JsonIteratorPool_borrowJsonIteratorTest_3_Test {
  @Test
  public void borrowJsonIteratorTest() throws Exception {
    // Arrange and Act
    JsonIterator actual = JsonIteratorPool.borrowJsonIterator();

    // Assert
    String toStringResult = actual.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, actual.configCache);
    Assert.assertEquals("", actual.readNumberAsString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
