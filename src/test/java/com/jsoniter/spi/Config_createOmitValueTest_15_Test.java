package com.jsoniter.spi;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.spi.Config;
import com.jsoniter.spi.OmitValue;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Config_createOmitValueTest_15_Test {
  @Test
  public void createOmitValueTest() throws Exception {
    // Arrange
    Config.Builder builder = new Config.Builder();
    Config config = new Config("aaaaa", builder);
    ArrayType arrayType = (ArrayType) null;

    // Act
    OmitValue actual = config.createOmitValue(arrayType);

    // Assert
    Assert.assertTrue(actual instanceof OmitValue.Null);
    Assert.assertEquals("null == %s", actual.code());
    Assert.assertEquals(null, arrayType);
    String toStringResult = config.toString();
    Config.Builder builderResult = config.builder();
    Assert.assertNotNull(toStringResult);
    Assert.assertSame(builder, builderResult);
    Assert.assertEquals(
        "Config{decodingMode=REFLECTION_MODE, encodingMode=REFLECTION_MODE, indentionStep=0, escapeUnicode=true, omitDefaultValue=false}",
        builderResult.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
