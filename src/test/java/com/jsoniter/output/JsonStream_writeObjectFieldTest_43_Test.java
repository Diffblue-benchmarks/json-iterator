package com.jsoniter.output;

import com.jsoniter.output.JsonStream;
import com.jsoniter.spi.Encoder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class JsonStream_writeObjectFieldTest_43_Test {
  @Test
  public void writeObjectFieldTest() throws Exception {
    // Arrange
    JsonStream jsonStream = Whitebox.newInstance(JsonStream.class);
    String key = "aaaaa";
    Encoder.StringDoubleEncoder stringDoubleEncoder = new Encoder.StringDoubleEncoder();

    // Act and Assert
    thrown.expect(ClassCastException.class);
    jsonStream.writeObjectField(key, stringDoubleEncoder);
    Assert.assertNotNull(stringDoubleEncoder.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
