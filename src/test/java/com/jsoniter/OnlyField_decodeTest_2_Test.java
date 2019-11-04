package com.jsoniter;

import com.jsoniter.JsonIterator;
import com.jsoniter.ReflectionObjectDecoder;
import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class OnlyField_decodeTest_2_Test {
//failed_run   @Test
//  public void decodeTest() throws Exception {
//    // Arrange
//    ReflectionObjectDecoder.OnlyField onlyField = ((ReflectionObjectDecoder) null).new OnlyField();
//    JsonIterator jsonIterator = new JsonIterator();
//    jsonIterator.configCache = (Config) null;
//
//    // Act and Assert
//    thrown.expect(ArrayIndexOutOfBoundsException.class);
//    onlyField.decode(jsonIterator);
//    String toStringResult = jsonIterator.toString();
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(null, jsonIterator.configCache);
//    Assert.assertEquals("", jsonIterator.readNumberAsString());
//    Assert.assertNotNull(onlyField.toString());
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
