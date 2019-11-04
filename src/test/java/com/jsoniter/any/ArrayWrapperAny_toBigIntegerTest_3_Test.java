package com.jsoniter.any;

import com.jsoniter.any.ArrayWrapperAny;
import java.math.BigInteger;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ArrayWrapperAny_toBigIntegerTest_3_Test {
  @Test
  public void toBigIntegerTest() throws Exception {
    // Arrange
    ArrayWrapperAny arrayWrapperAny = new ArrayWrapperAny("aaaaa");

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    arrayWrapperAny.toBigInteger();
    Assert.assertEquals("\"aaaaa\"", arrayWrapperAny.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
