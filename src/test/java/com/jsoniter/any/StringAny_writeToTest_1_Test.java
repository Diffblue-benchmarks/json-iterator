package com.jsoniter.any;

import com.jsoniter.any.StringAny;
import com.jsoniter.output.JsonStream;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class StringAny_writeToTest_1_Test {
  @Test
  public void writeToTest() throws Exception {
    // Arrange
    StringAny stringAny = new StringAny("aaaaa");
    JsonStream jsonStream = (JsonStream) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    stringAny.writeTo(jsonStream);
    Assert.assertEquals(null, jsonStream);
    String toStringResult = stringAny.toString();
    Assert.assertEquals("aaaaa", toStringResult);
    Assert.assertEquals(0, stringAny.size());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
