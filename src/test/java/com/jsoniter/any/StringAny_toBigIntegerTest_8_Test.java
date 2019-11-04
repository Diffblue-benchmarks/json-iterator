package com.jsoniter.any;

import com.jsoniter.any.StringAny;
import java.math.BigInteger;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class StringAny_toBigIntegerTest_8_Test {
  @Test
  public void toBigIntegerTest() throws Exception {
    // Arrange
    StringAny stringAny = new StringAny("aaaaa");

    // Act and Assert
    thrown.expect(NumberFormatException.class);
    stringAny.toBigInteger();
    String toStringResult = stringAny.toString();
    Assert.assertEquals("aaaaa", toStringResult);
    Assert.assertEquals(0, stringAny.size());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
