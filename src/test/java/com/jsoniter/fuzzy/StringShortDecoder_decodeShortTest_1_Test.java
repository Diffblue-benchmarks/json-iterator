package com.jsoniter.fuzzy;

import com.jsoniter.JsonIterator;
import com.jsoniter.fuzzy.StringShortDecoder;
import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class StringShortDecoder_decodeShortTest_1_Test {
  @Test
  public void decodeShortTest() throws Exception {
    // Arrange
    StringShortDecoder stringShortDecoder = new StringShortDecoder();
    JsonIterator jsonIterator = new JsonIterator();
    jsonIterator.configCache = (Config) null;

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    stringShortDecoder.decodeShort(jsonIterator);
    String toStringResult = jsonIterator.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, jsonIterator.configCache);
    Assert.assertEquals("", jsonIterator.readNumberAsString());
    Assert.assertNotNull(stringShortDecoder.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
