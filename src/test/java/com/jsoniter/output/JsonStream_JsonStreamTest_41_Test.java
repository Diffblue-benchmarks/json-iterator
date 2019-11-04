package com.jsoniter.output;

import com.jsoniter.output.JsonStream;
import com.jsoniter.spi.JsonException;
import java.io.ByteArrayOutputStream;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class JsonStream_JsonStreamTest_41_Test {
  @Test
  public void JsonStreamTest() throws Exception {
    // Arrange
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    int bufSize = 1;

    // Act and Assert
    thrown.expect(JsonException.class);
    new JsonStream(byteArrayOutputStream, bufSize);
    String toStringResult = byteArrayOutputStream.toString();
    Assert.assertEquals("", toStringResult);
    Assert.assertEquals(0, byteArrayOutputStream.size());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
