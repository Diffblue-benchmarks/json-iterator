package com.jsoniter;

import com.jsoniter.ReflectionDecoderFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReflectionDecoderFactory_ReflectionDecoderFactoryTest_2_Test {
  @Test
  public void ReflectionDecoderFactoryTest() throws Exception {
    // Arrange and Act
    ReflectionDecoderFactory reflectionDecoderFactory = new ReflectionDecoderFactory();

    // Assert
    Assert.assertNotNull(reflectionDecoderFactory.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
