package com.jsoniter;

import com.jsoniter.JsonIterator;
import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JsonIterator_parseTest_13_Test {
  @Test
  public void parseTest() throws Exception {
    // Arrange
    String str = "aaaaa";

    // Act
    JsonIterator actual = JsonIterator.parse(str);

    // Assert
    String toStringResult = actual.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, actual.configCache);
    Assert.assertEquals("", actual.readNumberAsString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
