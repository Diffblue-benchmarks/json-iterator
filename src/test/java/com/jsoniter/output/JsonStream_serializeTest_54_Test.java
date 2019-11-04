package com.jsoniter.output;

import com.jsoniter.output.JsonStream;
import com.jsoniter.spi.Config;
import java.io.ByteArrayOutputStream;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class JsonStream_serializeTest_54_Test {
  @Test
  public void serializeTest() throws Exception {
    // Arrange
    Config config = (Config) null;
    String obj = "aaaaa";
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    JsonStream.serialize(config, obj, byteArrayOutputStream);
    Assert.assertEquals(null, config);
    String toStringResult = byteArrayOutputStream.toString();
    Assert.assertEquals("", toStringResult);
    Assert.assertEquals(0, byteArrayOutputStream.size());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
