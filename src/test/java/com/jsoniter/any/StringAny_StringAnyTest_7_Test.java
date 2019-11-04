package com.jsoniter.any;

import com.jsoniter.any.StringAny;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StringAny_StringAnyTest_7_Test {
  @Test
  public void StringAnyTest() throws Exception {
    // Arrange
    String val = "aaaaa";

    // Act
    StringAny stringAny = new StringAny(val);

    // Assert
    String toStringResult = stringAny.toString();
    Assert.assertEquals("aaaaa", toStringResult);
    Assert.assertEquals(0, stringAny.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
