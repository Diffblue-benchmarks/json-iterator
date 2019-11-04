package com.jsoniter;

import com.jsoniter.IterImplForStreaming;
import com.jsoniter.JsonIterator;
import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class IterImplForStreaming_readIntSlowPathTest_7_Test {
  @Test
  public void readIntSlowPathTest() throws Exception {
    // Arrange
    JsonIterator jsonIterator = new JsonIterator();
    jsonIterator.configCache = (Config) null;
    int value = 1;

    // Act
    int actual = IterImplForStreaming.readIntSlowPath(jsonIterator, value);

    // Assert
    Assert.assertEquals(-1, actual);
    String toStringResult = jsonIterator.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, jsonIterator.configCache);
    Assert.assertEquals("", jsonIterator.readNumberAsString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
