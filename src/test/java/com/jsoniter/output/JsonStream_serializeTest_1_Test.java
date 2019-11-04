package com.jsoniter.output;

import com.jsoniter.output.JsonStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JsonStream_serializeTest_1_Test {
  @Test
  public void serializeTest() throws Exception {
    // Arrange
    String obj = "aaaaa";

    // Act
    String actual = JsonStream.serialize(obj);

    // Assert
    Assert.assertEquals("\"aaaaa\"", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
