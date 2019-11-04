package com.jsoniter.fuzzy;

import com.jsoniter.JsonIterator;
import com.jsoniter.fuzzy.StringFloatDecoder;
import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class StringFloatDecoder_decodeFloatTest_1_Test {
  @Test
  public void decodeFloatTest() throws Exception {
    // Arrange
    StringFloatDecoder stringFloatDecoder = new StringFloatDecoder();
    JsonIterator jsonIterator = new JsonIterator();
    jsonIterator.configCache = (Config) null;

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    stringFloatDecoder.decodeFloat(jsonIterator);
    String toStringResult = jsonIterator.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, jsonIterator.configCache);
    Assert.assertEquals("", jsonIterator.readNumberAsString());
    Assert.assertNotNull(stringFloatDecoder.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
