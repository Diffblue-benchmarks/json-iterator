package com.jsoniter.output;

import com.jsoniter.output.JsonStream;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class JsonStream_closeTest_12_Test {
  @Test
  public void closeTest() throws Exception {
    // Arrange
    JsonStream jsonStream = Whitebox.newInstance(JsonStream.class);

    // Act
    jsonStream.close();
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
