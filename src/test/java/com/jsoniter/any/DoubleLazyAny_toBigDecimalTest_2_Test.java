package com.jsoniter.any;

import com.jsoniter.any.DoubleLazyAny;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class DoubleLazyAny_toBigDecimalTest_2_Test {
  @Test
  public void toBigDecimalTest() throws Exception {
    // Arrange
    DoubleLazyAny doubleLazyAny = new DoubleLazyAny(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 167772161, 1);

    // Act and Assert
    thrown.expect(StringIndexOutOfBoundsException.class);
    doubleLazyAny.toBigDecimal();
    Assert.assertEquals(0, doubleLazyAny.size());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
