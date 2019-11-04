package com.jsoniter;

import com.jsoniter.ReflectionArrayDecoder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ReflectionArrayDecoder_ReflectionArrayDecoderTest_2_Test {
  @Test
  public void ReflectionArrayDecoderTest() throws Exception {
    // Arrange
    Class resultClass = (Class) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    new ReflectionArrayDecoder(resultClass);
    Assert.assertEquals(null, resultClass);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
