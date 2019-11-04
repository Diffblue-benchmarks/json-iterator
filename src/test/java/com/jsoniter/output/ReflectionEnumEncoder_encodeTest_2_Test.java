package com.jsoniter.output;

import com.jsoniter.output.JsonStream;
import com.jsoniter.output.ReflectionEnumEncoder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ReflectionEnumEncoder_encodeTest_2_Test {
  @Test
  public void encodeTest() throws Exception {
    // Arrange
    ReflectionEnumEncoder reflectionEnumEncoder = new ReflectionEnumEncoder(null);
    String obj = "aaaaa";
    JsonStream jsonStream = (JsonStream) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    reflectionEnumEncoder.encode(obj, jsonStream);
    Assert.assertEquals(null, jsonStream);
    Assert.assertNotNull(reflectionEnumEncoder.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
