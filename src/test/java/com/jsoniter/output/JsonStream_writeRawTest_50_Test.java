package com.jsoniter.output;

import com.jsoniter.output.JsonStream;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class JsonStream_writeRawTest_50_Test {
  @Test
  public void writeRawTest() throws Exception {
    // Arrange
    JsonStream jsonStream = Whitebox.newInstance(JsonStream.class);
    String val = "aaaaa";
    int remaining = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    jsonStream.writeRaw(val, remaining);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
