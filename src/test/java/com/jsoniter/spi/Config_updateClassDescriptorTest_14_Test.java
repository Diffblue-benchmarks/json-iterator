package com.jsoniter.spi;

import com.jsoniter.spi.ClassDescriptor;
import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Config_updateClassDescriptorTest_14_Test {
  @Test
  public void updateClassDescriptorTest() throws Exception {
    // Arrange
    Config.Builder builder = new Config.Builder();
    Config config = new Config("aaaaa", builder);
    ClassDescriptor classDescriptor = (ClassDescriptor) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    config.updateClassDescriptor(classDescriptor);
    Assert.assertEquals(null, classDescriptor);
    String toStringResult = config.toString();
    Config.Builder builderResult = config.builder();
    Assert.assertNotNull(toStringResult);
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
