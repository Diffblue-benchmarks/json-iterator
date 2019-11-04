package com.jsoniter.any;

import com.jsoniter.any.Any;
import com.jsoniter.any.NotFoundAny;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class NotFoundAny_getTest_17_Test {
  @Test
  public void getTest() throws Exception {
    // Arrange
    NotFoundAny notFoundAny = new NotFoundAny(1, "aaaaa");
    int index = 1;

    // Act
    Any actual = notFoundAny.get(index);

    // Assert
    Assert.assertSame(notFoundAny, actual);
    Assert.assertTrue(actual instanceof NotFoundAny);
    Assert.assertSame(notFoundAny, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
