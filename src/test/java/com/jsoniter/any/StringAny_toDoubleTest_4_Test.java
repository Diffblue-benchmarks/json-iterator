package com.jsoniter.any;

import com.jsoniter.any.StringAny;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class StringAny_toDoubleTest_4_Test {
  @Test
  public void toDoubleTest() throws Exception {
    // Arrange
    StringAny stringAny = new StringAny("aaaaa");

    // Act and Assert
    thrown.expect(NumberFormatException.class);
    stringAny.toDouble();
    String toStringResult = stringAny.toString();
    Assert.assertEquals("aaaaa", toStringResult);
    Assert.assertEquals(0, stringAny.size());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}