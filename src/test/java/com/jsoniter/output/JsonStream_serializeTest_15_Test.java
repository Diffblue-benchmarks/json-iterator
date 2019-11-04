package com.jsoniter.output;

import com.jsoniter.output.JsonStream;
import java.io.ByteArrayOutputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JsonStream_serializeTest_15_Test {
  @Test
  public void serializeTest() throws Exception {
    // Arrange
    String obj = "aaaaa";
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

    // Act
    JsonStream.serialize(obj, byteArrayOutputStream);

    // Assert
    String toStringResult = byteArrayOutputStream.toString();
    Assert.assertEquals("\"aaaaa\"", toStringResult);
    Assert.assertEquals(7, byteArrayOutputStream.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
