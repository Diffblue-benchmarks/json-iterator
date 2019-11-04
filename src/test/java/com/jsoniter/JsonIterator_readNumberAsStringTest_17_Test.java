package com.jsoniter;

import com.jsoniter.JsonIterator;
import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JsonIterator_readNumberAsStringTest_17_Test {
  @Test
  public void readNumberAsStringTest() throws Exception {
    // Arrange
    JsonIterator jsonIterator = new JsonIterator();
    jsonIterator.configCache = (Config) null;

    // Act
    String actual = jsonIterator.readNumberAsString();

    // Assert
    Assert.assertEquals("", actual);
    String toStringResult = jsonIterator.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, jsonIterator.configCache);
    Assert.assertEquals("", jsonIterator.readNumberAsString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
