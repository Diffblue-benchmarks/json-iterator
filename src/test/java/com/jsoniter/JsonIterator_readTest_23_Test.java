package com.jsoniter;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.JsonIterator;
import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class JsonIterator_readTest_23_Test {
//failed_compile   @Test
//  public void readTest() throws Exception {
//    // Arrange
//    JsonIterator jsonIterator = new JsonIterator();
//    jsonIterator.configCache = (Config) null;
//    ArrayType arrayType = (ArrayType) null;
//
//    // Act and Assert
//    thrown.expect(UnsupportedOperationException.class);
//    jsonIterator.read(arrayType);
//    Assert.assertEquals(null, arrayType);
//    String toStringResult = jsonIterator.toString();
//    String readNumberAsStringResult = jsonIterator.readNumberAsString();
//    Config config = jsonIterator.configCache;
//    Assert.assertNotNull(toStringResult);
//    String toStringResult1 = config.toString();
//    Assert.assertEquals("", readNumberAsStringResult);
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertEquals(
//        "Config{decodingMode=REFLECTION_MODE, encodingMode=REFLECTION_MODE, indentionStep=0, escapeUnicode=true, omitDefaultValue=false}",
//        (config.builder()).toString());
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
