package com.jsoniter.any;

import com.jsoniter.any.ObjectLazyAny;
import java.math.BigDecimal;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ObjectLazyAny_toBigDecimalTest_5_Test {
  @Test
  public void toBigDecimalTest() throws Exception {
    // Arrange
    ObjectLazyAny objectLazyAny = new ObjectLazyAny(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 167772161, 1);

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    objectLazyAny.toBigDecimal();
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
