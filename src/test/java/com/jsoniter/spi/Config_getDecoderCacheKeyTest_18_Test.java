package com.jsoniter.spi;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Config_getDecoderCacheKeyTest_18_Test {
  @Test
  public void getDecoderCacheKeyTest() throws Exception {
    // Arrange
    Config.Builder builder = new Config.Builder();
    Config config = new Config("aaaaa", builder);
    ArrayType arrayType = (ArrayType) null;

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    config.getDecoderCacheKey(arrayType);
    Assert.assertEquals(null, arrayType);
    Config.Builder builderResult = config.builder();
    Assert.assertSame(builder, builderResult);
    Assert.assertEquals(
        "Config{decodingMode=REFLECTION_MODE, encodingMode=REFLECTION_MODE, indentionStep=0, escapeUnicode=true, omitDefaultValue=false}",
        builderResult.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
