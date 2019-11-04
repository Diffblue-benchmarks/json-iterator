package com.jsoniter;

import com.jsoniter.ReflectionObjectDecoder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WithWrapper_ReflectionObjectDecoder$WithWrapperTest_2_Test {
  @Test
  public void ReflectionObjectDecoder$WithWrapperTest() throws Exception {
    // Arrange
    ReflectionObjectDecoder reflectionObjectDecoder = (ReflectionObjectDecoder) null;

    // Act
    reflectionObjectDecoder.new WithWrapper();

    // Assert
    Assert.assertEquals(null, reflectionObjectDecoder);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
