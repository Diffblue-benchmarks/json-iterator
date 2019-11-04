package com.jsoniter.any;

import com.jsoniter.any.ArrayWrapperAny;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ArrayWrapperAny_toBigDecimalTest_4_Test {
  @Test
  public void toBigDecimalTest() throws Exception {
    // Arrange
    ArrayWrapperAny arrayWrapperAny = new ArrayWrapperAny("aaaaa");

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    arrayWrapperAny.toBigDecimal();
    Assert.assertEquals("\"aaaaa\"", arrayWrapperAny.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
