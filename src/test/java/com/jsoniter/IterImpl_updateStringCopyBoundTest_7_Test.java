package com.jsoniter;

import com.jsoniter.IterImpl;
import com.jsoniter.JsonIterator;
import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class IterImpl_updateStringCopyBoundTest_7_Test {
  @Test
  public void updateStringCopyBoundTest() throws Exception {
    // Arrange
    JsonIterator jsonIterator = new JsonIterator();
    jsonIterator.configCache = (Config) null;
    int bound = 1;

    // Act
    int actual = IterImpl.updateStringCopyBound(jsonIterator, bound);

    // Assert
    Assert.assertEquals(1, actual);
    String toStringResult = jsonIterator.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, jsonIterator.configCache);
    Assert.assertEquals("", jsonIterator.readNumberAsString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
