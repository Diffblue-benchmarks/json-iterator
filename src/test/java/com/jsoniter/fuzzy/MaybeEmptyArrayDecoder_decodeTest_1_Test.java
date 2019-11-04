package com.jsoniter.fuzzy;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.JsonIterator;
import com.jsoniter.fuzzy.MaybeEmptyArrayDecoder;
import com.jsoniter.spi.Binding;
import com.jsoniter.spi.Config;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class MaybeEmptyArrayDecoder_decodeTest_1_Test {
  @Test
  public void decodeTest() throws Exception {
    // Arrange
    HashMap<String, Type> hashMap = new HashMap<String, Type>();
    hashMap.put("aaaaa", null);
    MaybeEmptyArrayDecoder maybeEmptyArrayDecoder = new MaybeEmptyArrayDecoder(null);
    JsonIterator jsonIterator = new JsonIterator();
    jsonIterator.configCache = (Config) null;

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    maybeEmptyArrayDecoder.decode(jsonIterator);
    String toStringResult = jsonIterator.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, jsonIterator.configCache);
    Assert.assertEquals("", jsonIterator.readNumberAsString());
    Assert.assertNotNull(maybeEmptyArrayDecoder.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
