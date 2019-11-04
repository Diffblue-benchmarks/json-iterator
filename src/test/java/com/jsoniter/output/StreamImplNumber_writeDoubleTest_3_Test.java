package com.jsoniter.output;

import com.jsoniter.output.JsonStream;
import com.jsoniter.output.StreamImplNumber;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class StreamImplNumber_writeDoubleTest_3_Test {
  @Test
  public void writeDoubleTest() throws Exception {
    // Arrange
    JsonStream jsonStream = (JsonStream) null;
    double val = 1.0;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    StreamImplNumber.writeDouble(jsonStream, val);
    Assert.assertEquals(null, jsonStream);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}