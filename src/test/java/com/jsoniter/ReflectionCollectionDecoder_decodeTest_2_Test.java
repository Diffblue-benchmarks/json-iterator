package com.jsoniter;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.JsonIterator;
import com.jsoniter.ReflectionCollectionDecoder;
import com.jsoniter.spi.Config;
import java.lang.reflect.Type;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class ReflectionCollectionDecoder_decodeTest_2_Test {
//failed_run   @Test
//  public void decodeTest() throws Exception {
//    // Arrange
//    ReflectionCollectionDecoder reflectionCollectionDecoder = Whitebox.newInstance(ReflectionCollectionDecoder.class);
//    JsonIterator jsonIterator = new JsonIterator();
//    jsonIterator.configCache = (Config) null;
//
//    // Act
//    Object actual = reflectionCollectionDecoder.decode(jsonIterator);
//
//    // Assert
//    Assert.assertEquals(null, actual);
//    String toStringResult = jsonIterator.toString();
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(null, jsonIterator.configCache);
//    Assert.assertEquals("", jsonIterator.readNumberAsString());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
