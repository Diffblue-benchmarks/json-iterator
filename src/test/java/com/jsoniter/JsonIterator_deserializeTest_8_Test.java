package com.jsoniter;

import com.jsoniter.JsonIterator;
import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class JsonIterator_deserializeTest_8_Test {
  @Test
  public void deserializeTest() throws Exception {
    // Arrange
    Config config = (Config) null;
    String input = "aaaaa";
    Class<Object> resultClass = (Class<Object>) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    JsonIterator.<Object>deserialize(config, input, resultClass);
    Assert.assertEquals(null, config);
    Assert.assertEquals(null, resultClass);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
