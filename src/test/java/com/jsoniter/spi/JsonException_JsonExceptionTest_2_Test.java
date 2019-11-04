package com.jsoniter.spi;

import com.jsoniter.spi.JsonException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JsonException_JsonExceptionTest_2_Test {
  @Test
  public void JsonExceptionTest() throws Exception {
    // Arrange and Act
    JsonException jsonException = new JsonException();

    // Assert
    String toStringResult = jsonException.toString();
    Throwable[] suppressed = jsonException.getSuppressed();
    String message = jsonException.getMessage();
    Throwable cause = jsonException.getCause();
    Assert.assertEquals("com.jsoniter.spi.JsonException", toStringResult);
    Assert.assertEquals(null, jsonException.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals(null, message);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
