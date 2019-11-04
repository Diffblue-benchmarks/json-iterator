package com.jsoniter.spi;

import com.jsoniter.spi.JsonException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JsonException_JsonExceptionTest_3_Test {
  @Test
  public void JsonExceptionTest() throws Exception {
    // Arrange
    String message = "aaaaa";

    // Act
    JsonException jsonException = new JsonException(message);

    // Assert
    String toStringResult = jsonException.toString();
    Throwable[] suppressed = jsonException.getSuppressed();
    String message1 = jsonException.getMessage();
    Throwable cause = jsonException.getCause();
    Assert.assertEquals("com.jsoniter.spi.JsonException: aaaaa", toStringResult);
    Assert.assertEquals("aaaaa", jsonException.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals("aaaaa", message1);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
