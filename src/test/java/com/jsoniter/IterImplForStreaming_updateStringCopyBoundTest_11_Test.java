package com.jsoniter;

import com.jsoniter.IterImplForStreaming;
import com.jsoniter.JsonIterator;
import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class IterImplForStreaming_updateStringCopyBoundTest_11_Test {
  @Test
  public void updateStringCopyBoundTest() throws Exception {
    // Arrange
    JsonIterator jsonIterator = new JsonIterator();
    jsonIterator.configCache = (Config) null;
    int bound = 1;

    // Act
    int actual = IterImplForStreaming.updateStringCopyBound(jsonIterator, bound);

    // Assert
    Assert.assertEquals(0, actual);
    String toStringResult = jsonIterator.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, jsonIterator.configCache);
    Assert.assertEquals("", jsonIterator.readNumberAsString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
