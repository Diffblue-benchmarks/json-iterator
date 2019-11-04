package com.jsoniter;

import com.jsoniter.CodegenAccess;
import com.jsoniter.JsonIterator;
import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CodegenAccess_resetExistingObjectTest_24_Test {
  @Test
  public void resetExistingObjectTest() throws Exception {
    // Arrange
    JsonIterator jsonIterator = new JsonIterator();
    jsonIterator.configCache = (Config) null;

    // Act
    Object actual = CodegenAccess.resetExistingObject(jsonIterator);

    // Assert
    Assert.assertEquals(null, actual);
    String toStringResult = jsonIterator.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, jsonIterator.configCache);
    Assert.assertEquals("", jsonIterator.readNumberAsString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
