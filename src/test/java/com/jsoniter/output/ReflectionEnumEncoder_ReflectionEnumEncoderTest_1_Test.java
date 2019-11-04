package com.jsoniter.output;

import com.jsoniter.output.ReflectionEnumEncoder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReflectionEnumEncoder_ReflectionEnumEncoderTest_1_Test {
  @Test
  public void ReflectionEnumEncoderTest() throws Exception {
    // Arrange
    Class resultClass = (Class) null;

    // Act
    ReflectionEnumEncoder reflectionEnumEncoder = new ReflectionEnumEncoder(resultClass);

    // Assert
    Assert.assertNotNull(reflectionEnumEncoder.toString());
    Assert.assertEquals(null, resultClass);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
