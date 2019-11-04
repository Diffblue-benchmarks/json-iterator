package com.jsoniter;

import com.jsoniter.ReflectionObjectDecoder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WithCtor_ReflectionObjectDecoder$WithCtorTest_2_Test {
  @Test
  public void ReflectionObjectDecoder$WithCtorTest() throws Exception {
    // Arrange
    ReflectionObjectDecoder reflectionObjectDecoder = (ReflectionObjectDecoder) null;

    // Act
    ReflectionObjectDecoder.WithCtor withCtor = reflectionObjectDecoder.new WithCtor();

    // Assert
    Assert.assertNotNull(withCtor.toString());
    Assert.assertEquals(null, reflectionObjectDecoder);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
