package com.jsoniter.output;

import com.jsoniter.output.JsonStream;
import com.jsoniter.output.StreamImplNumber;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class StreamImplNumber_writeLongTest_1_Test {
  @Test
  public void writeLongTest() throws Exception {
    // Arrange
    JsonStream jsonStream = (JsonStream) null;
    long value = 1L;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    StreamImplNumber.writeLong(jsonStream, value);
    Assert.assertEquals(null, jsonStream);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
