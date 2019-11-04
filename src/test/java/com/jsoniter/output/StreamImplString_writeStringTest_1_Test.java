package com.jsoniter.output;

import com.jsoniter.output.JsonStream;
import com.jsoniter.output.StreamImplString;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class StreamImplString_writeStringTest_1_Test {
  @Test
  public void writeStringTest() throws Exception {
    // Arrange
    JsonStream jsonStream = (JsonStream) null;
    String val = "aaaaa";

    // Act and Assert
    thrown.expect(NullPointerException.class);
    StreamImplString.writeString(jsonStream, val);
    Assert.assertEquals(null, jsonStream);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
