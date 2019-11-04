package com.jsoniter.output;

import com.jsoniter.output.JsonStream;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class JsonStream_writeTest_39_Test {
  @Test
  public void writeTest() throws Exception {
    // Arrange
    JsonStream jsonStream = Whitebox.newInstance(JsonStream.class);
    byte b1 = (byte) 0;
    byte b2 = (byte) 0;
    byte b3 = (byte) 0;
    byte b4 = (byte) 0;
    byte b5 = (byte) 0;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    jsonStream.write(b1, b2, b3, b4, b5);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
