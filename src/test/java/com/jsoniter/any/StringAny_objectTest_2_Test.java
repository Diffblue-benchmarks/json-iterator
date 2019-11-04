package com.jsoniter.any;

import com.jsoniter.any.StringAny;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StringAny_objectTest_2_Test {
  @Test
  public void objectTest() throws Exception {
    // Arrange
    StringAny stringAny = new StringAny("aaaaa");

    // Act
    Object actual = stringAny.object();

    // Assert
    Assert.assertTrue(actual instanceof String);
    Assert.assertEquals("aaaaa", actual);
    String toStringResult = stringAny.toString();
    Assert.assertEquals("aaaaa", toStringResult);
    Assert.assertEquals(0, stringAny.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
