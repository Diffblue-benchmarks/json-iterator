package com.jsoniter;

import com.jsoniter.JsonIterator;
import com.jsoniter.ReflectionArrayDecoder;
import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class ReflectionArrayDecoder_decodeTest_1_Test {
//failed_run   @Test
//  public void decodeTest() throws Exception {
//    // Arrange
//    ReflectionArrayDecoder reflectionArrayDecoder = Whitebox.newInstance(ReflectionArrayDecoder.class);
//    JsonIterator jsonIterator = new JsonIterator();
//    jsonIterator.configCache = (Config) null;
//
//    // Act
//    Object actual = reflectionArrayDecoder.decode(jsonIterator);
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
