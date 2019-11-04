package com.jsoniter.any;

import com.jsoniter.any.ArrayWrapperAny;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ArrayWrapperAny_toStringTest_5_Test {
  @Test
  public void toStringTest() throws Exception {
    // Arrange
    ArrayWrapperAny arrayWrapperAny = new ArrayWrapperAny("aaaaa");

    // Act
    String actual = arrayWrapperAny.toString();

    // Assert
    Assert.assertEquals("\"aaaaa\"", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
