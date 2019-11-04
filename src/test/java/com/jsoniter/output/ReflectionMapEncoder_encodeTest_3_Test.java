package com.jsoniter.output;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.output.JsonStream;
import com.jsoniter.output.ReflectionMapEncoder;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Type;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ReflectionMapEncoder_encodeTest_3_Test {
  @Test
  public void encodeTest() throws Exception {
    // Arrange
    ReflectionMapEncoder reflectionMapEncoder = new ReflectionMapEncoder(null, new Type[]{null, null, null});
    String obj = "aaaaa";
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    byteArrayOutputStream.write(1);
    byteArrayOutputStream.write(1);
    JsonStream jsonStream = (JsonStream) null;

    // Act and Assert
    thrown.expect(ClassCastException.class);
    reflectionMapEncoder.encode(obj, jsonStream);
    Assert.assertEquals(null, jsonStream);
    Assert.assertNotNull(reflectionMapEncoder.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
