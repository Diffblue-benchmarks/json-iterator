package com.jsoniter.spi;

import com.jsoniter.spi.JsonException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JsonException_JsonExceptionTest_1_Test {
  @Test
  public void JsonExceptionTest() throws Exception {
    // Arrange
    Throwable throwable = new Throwable();

    // Act
    JsonException jsonException = new JsonException(throwable);

    // Assert
    String toStringResult = jsonException.toString();
    Throwable[] suppressed = jsonException.getSuppressed();
    String message = jsonException.getMessage();
    Throwable cause = jsonException.getCause();
    Assert.assertEquals("com.jsoniter.spi.JsonException: java.lang.Throwable", toStringResult);
    Assert.assertEquals("java.lang.Throwable", jsonException.getLocalizedMessage());
    Assert.assertSame(throwable, cause);
    String toStringResult1 = cause.toString();
    Throwable[] suppressed1 = cause.getSuppressed();
    String message1 = cause.getMessage();
    Throwable cause1 = cause.getCause();
    Assert.assertEquals("java.lang.Throwable", message);
    Assert.assertEquals(0, suppressed.length);
    Assert.assertEquals(null, cause1);
    Assert.assertEquals(null, message1);
    Assert.assertSame(suppressed, suppressed1);
    Assert.assertEquals("java.lang.Throwable", toStringResult1);
    Assert.assertEquals(null, cause.getLocalizedMessage());
    Assert.assertSame(cause, throwable);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
