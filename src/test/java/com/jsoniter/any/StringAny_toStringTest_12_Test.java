package com.jsoniter.any;

import com.jsoniter.any.StringAny;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StringAny_toStringTest_12_Test {
  @Test
  public void toStringTest() throws Exception {
    // Arrange
    StringAny stringAny = new StringAny("aaaaa");

    // Act
    String actual = stringAny.toString();

    // Assert
    Assert.assertEquals("aaaaa", actual);
    String toStringResult = stringAny.toString();
    Assert.assertEquals("aaaaa", toStringResult);
    Assert.assertEquals(0, stringAny.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
