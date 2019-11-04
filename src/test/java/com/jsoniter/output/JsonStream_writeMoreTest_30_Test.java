package com.jsoniter.output;

import com.jsoniter.output.JsonStream;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class JsonStream_writeMoreTest_30_Test {
  @Test
  public void writeMoreTest() throws Exception {
    // Arrange
    JsonStream jsonStream = Whitebox.newInstance(JsonStream.class);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    jsonStream.writeMore();
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
