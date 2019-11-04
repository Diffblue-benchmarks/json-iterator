package com.jsoniter.any;

import com.jsoniter.any.ArrayWrapperAny;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ArrayWrapperAny_toFloatTest_6_Test {
  @Test
  public void toFloatTest() throws Exception {
    // Arrange
    ArrayWrapperAny arrayWrapperAny = new ArrayWrapperAny("aaaaa");

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    arrayWrapperAny.toFloat();
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}