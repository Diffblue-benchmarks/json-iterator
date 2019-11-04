package com.jsoniter.any;

import com.jsoniter.any.Any;
import com.jsoniter.any.NotFoundAny;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class NotFoundAny_getTest_1_Test {
  @Test
  public void getTest() throws Exception {
    // Arrange
    NotFoundAny notFoundAny = new NotFoundAny(1, "aaaaa");
    String key = "aaaaa";

    // Act
    Any actual = notFoundAny.get(key);

    // Assert
    Assert.assertSame(notFoundAny, actual);
    Assert.assertTrue(actual instanceof NotFoundAny);
    Assert.assertSame(notFoundAny, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
