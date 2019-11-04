package com.jsoniter.output;

import com.jsoniter.output.StreamImplString;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StreamImplString_StreamImplStringTest_2_Test {
  @Test
  public void StreamImplStringTest() throws Exception {
    // Arrange and Act
    StreamImplString streamImplString = new StreamImplString();

    // Assert
    Assert.assertNotNull(streamImplString.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
