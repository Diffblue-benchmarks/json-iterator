package com.jsoniter.spi;

import com.jsoniter.spi.JsonException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JsonException_JsonExceptionTest_4_Test {
  @Test
  public void JsonExceptionTest() throws Exception {
    // Arrange
    String message = "aaaaa";
    Throwable throwable = new Throwable();

    // Act
    JsonException jsonException = new JsonException(message, throwable);

    // Assert
    String toStringResult = jsonException.toString();
    Throwable[] suppressed = jsonException.getSuppressed();
    String message1 = jsonException.getMessage();
    Throwable cause = jsonException.getCause();
    Assert.assertEquals("com.jsoniter.spi.JsonException: aaaaa", toStringResult);
    Assert.assertEquals("aaaaa", jsonException.getLocalizedMessage());
    Assert.assertSame(throwable, cause);
    String toStringResult1 = cause.toString();
    Throwable[] suppressed1 = cause.getSuppressed();
    String message2 = cause.getMessage();
    Throwable cause1 = cause.getCause();
    Assert.assertEquals("aaaaa", message1);
    Assert.assertEquals(0, suppressed.length);
    Assert.assertEquals(null, cause1);
    Assert.assertEquals(null, message2);
    Assert.assertSame(suppressed, suppressed1);
    Assert.assertEquals("java.lang.Throwable", toStringResult1);
    Assert.assertEquals(null, cause.getLocalizedMessage());
    Assert.assertSame(cause, throwable);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
