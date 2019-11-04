package com.jsoniter.any;

import com.jsoniter.any.Any;
import com.jsoniter.any.StringAny;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StringAny_setTest_9_Test {
  @Test
  public void setTest() throws Exception {
    // Arrange
    StringAny stringAny = new StringAny("aaaaa");
    String newVal = "aaaaa";

    // Act
    Any actual = stringAny.set(newVal);

    // Assert
    Assert.assertSame(stringAny, actual);
    Assert.assertTrue(actual instanceof StringAny);
    Assert.assertSame(stringAny, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
