package com.jsoniter;

import com.jsoniter.CodegenAccess;
import com.jsoniter.JsonIterator;
import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CodegenAccess_readBooleanTest_4_Test {
  @Test
  public void readBooleanTest() throws Exception {
    // Arrange
    String cacheKey = "aaaaa";
    JsonIterator jsonIterator = new JsonIterator();
    jsonIterator.configCache = (Config) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    CodegenAccess.readBoolean(cacheKey, jsonIterator);
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