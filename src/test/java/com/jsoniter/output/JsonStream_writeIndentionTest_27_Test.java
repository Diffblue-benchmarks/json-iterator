package com.jsoniter.output;

import com.jsoniter.output.JsonStream;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class JsonStream_writeIndentionTest_27_Test {
  @Test
  public void writeIndentionTest() throws Exception {
    // Arrange
    JsonStream jsonStream = Whitebox.newInstance(JsonStream.class);

    // Act
    jsonStream.writeIndention();
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
