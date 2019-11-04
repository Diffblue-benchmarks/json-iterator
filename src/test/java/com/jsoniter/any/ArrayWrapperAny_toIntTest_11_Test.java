package com.jsoniter.any;

import com.jsoniter.any.ArrayWrapperAny;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ArrayWrapperAny_toIntTest_11_Test {
  @Test
  public void toIntTest() throws Exception {
    // Arrange
    ArrayWrapperAny arrayWrapperAny = new ArrayWrapperAny("aaaaa");

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    arrayWrapperAny.toInt();
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
