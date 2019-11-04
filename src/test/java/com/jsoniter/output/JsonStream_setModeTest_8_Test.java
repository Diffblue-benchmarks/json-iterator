package com.jsoniter.output;

import com.jsoniter.output.EncodingMode;
import com.jsoniter.output.JsonStream;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JsonStream_setModeTest_8_Test {
  @Test
  public void setModeTest() throws Exception {
    // Arrange
    EncodingMode mode = EncodingMode.DYNAMIC_MODE;

    // Act
    JsonStream.setMode(mode);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
