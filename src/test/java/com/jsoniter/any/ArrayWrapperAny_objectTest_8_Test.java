package com.jsoniter.any;

import com.jsoniter.any.ArrayWrapperAny;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ArrayWrapperAny_objectTest_8_Test {
  @Test
  public void objectTest() throws Exception {
    // Arrange
    ArrayWrapperAny arrayWrapperAny = new ArrayWrapperAny("aaaaa");

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    arrayWrapperAny.object();
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
