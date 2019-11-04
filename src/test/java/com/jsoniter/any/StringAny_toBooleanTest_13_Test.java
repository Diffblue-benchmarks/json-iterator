package com.jsoniter.any;

import com.jsoniter.any.StringAny;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StringAny_toBooleanTest_13_Test {
  @Test
  public void toBooleanTest() throws Exception {
    // Arrange
    StringAny stringAny = new StringAny("aaaaa");

    // Act
    boolean actual = stringAny.toBoolean();

    // Assert
    Assert.assertTrue(actual);
    String toStringResult = stringAny.toString();
    Assert.assertEquals("aaaaa", toStringResult);
    Assert.assertEquals(0, stringAny.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
