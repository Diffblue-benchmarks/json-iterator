package com.jsoniter;

import com.jsoniter.JsonIterator;
import com.jsoniter.ReflectionObjectDecoder;
import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class WithWrapper_decodeTest_1_Test {
//failed_run   @Test
//  public void decodeTest() throws Exception {
//    // Arrange
//    ReflectionObjectDecoder.WithWrapper withWrapper = ((ReflectionObjectDecoder) null).new WithWrapper();
//    JsonIterator jsonIterator = new JsonIterator();
//    jsonIterator.configCache = (Config) null;
//
//    // Act and Assert
//    thrown.expect(ArrayIndexOutOfBoundsException.class);
//    withWrapper.decode(jsonIterator);
//    String toStringResult = jsonIterator.toString();
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(null, jsonIterator.configCache);
//    Assert.assertEquals("", jsonIterator.readNumberAsString());
//    Assert.assertNotNull(withWrapper.toString());
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}