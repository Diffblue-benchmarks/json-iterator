package com.jsoniter;

import com.jsoniter.ReflectionEnumDecoder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ReflectionEnumDecoder_ReflectionEnumDecoderTest_1_Test {
  @Test
  public void ReflectionEnumDecoderTest() throws Exception {
    // Arrange
    Class resultClass = (Class) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    new ReflectionEnumDecoder(resultClass);
    Assert.assertEquals(null, resultClass);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
