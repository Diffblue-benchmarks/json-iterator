package com.jsoniter;

import com.jsoniter.IterImpl;
import com.jsoniter.JsonIterator;
import com.jsoniter.spi.Config;
import com.jsoniter.spi.JsonException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class IterImpl_skipArrayTest_14_Test {
  @Test
  public void skipArrayTest() throws Exception {
    // Arrange
    JsonIterator jsonIterator = new JsonIterator();
    jsonIterator.configCache = (Config) null;

    // Act and Assert
    thrown.expect(JsonException.class);
    IterImpl.skipArray(jsonIterator);
    String toStringResult = jsonIterator.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, jsonIterator.configCache);
    Assert.assertEquals("", jsonIterator.readNumberAsString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}