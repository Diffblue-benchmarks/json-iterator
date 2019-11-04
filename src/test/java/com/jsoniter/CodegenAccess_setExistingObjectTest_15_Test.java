package com.jsoniter;

import com.jsoniter.CodegenAccess;
import com.jsoniter.JsonIterator;
import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CodegenAccess_setExistingObjectTest_15_Test {
  @Test
  public void setExistingObjectTest() throws Exception {
    // Arrange
    JsonIterator jsonIterator = new JsonIterator();
    jsonIterator.configCache = (Config) null;
    String obj = "aaaaa";

    // Act
    CodegenAccess.setExistingObject(jsonIterator, obj);

    // Assert
    String toStringResult = jsonIterator.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, jsonIterator.configCache);
    Assert.assertEquals("", jsonIterator.readNumberAsString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
