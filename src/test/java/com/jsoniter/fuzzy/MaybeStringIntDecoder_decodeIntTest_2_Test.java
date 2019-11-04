package com.jsoniter.fuzzy;

import com.jsoniter.JsonIterator;
import com.jsoniter.fuzzy.MaybeStringIntDecoder;
import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class MaybeStringIntDecoder_decodeIntTest_2_Test {
  @Test
  public void decodeIntTest() throws Exception {
    // Arrange
    MaybeStringIntDecoder maybeStringIntDecoder = new MaybeStringIntDecoder();
    JsonIterator jsonIterator = new JsonIterator();
    jsonIterator.configCache = (Config) null;

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    maybeStringIntDecoder.decodeInt(jsonIterator);
    String toStringResult = jsonIterator.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, jsonIterator.configCache);
    Assert.assertEquals("", jsonIterator.readNumberAsString());
    Assert.assertNotNull(maybeStringIntDecoder.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
