package com.jsoniter.output;

import com.jsoniter.output.StreamImplNumber;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StreamImplNumber_StreamImplNumberTest_5_Test {
  @Test
  public void StreamImplNumberTest() throws Exception {
    // Arrange and Act
    StreamImplNumber streamImplNumber = new StreamImplNumber();

    // Assert
    Assert.assertNotNull(streamImplNumber.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
