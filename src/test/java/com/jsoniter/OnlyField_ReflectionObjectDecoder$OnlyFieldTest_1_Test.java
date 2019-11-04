package com.jsoniter;

import com.jsoniter.ReflectionObjectDecoder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class OnlyField_ReflectionObjectDecoder$OnlyFieldTest_1_Test {
  @Test
  public void ReflectionObjectDecoder$OnlyFieldTest() throws Exception {
    // Arrange
    ReflectionObjectDecoder reflectionObjectDecoder = (ReflectionObjectDecoder) null;

    // Act
    ReflectionObjectDecoder.OnlyField onlyField = reflectionObjectDecoder.new OnlyField();

    // Assert
    Assert.assertNotNull(onlyField.toString());
    Assert.assertEquals(null, reflectionObjectDecoder);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
