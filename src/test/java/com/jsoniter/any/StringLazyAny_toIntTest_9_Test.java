package com.jsoniter.any;

import com.jsoniter.any.StringLazyAny;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class StringLazyAny_toIntTest_9_Test {
  @Test
  public void toIntTest() throws Exception {
    // Arrange
    StringLazyAny stringLazyAny = new StringLazyAny(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 167772161, 1);

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    stringLazyAny.toInt();
    Assert.assertEquals(0, stringLazyAny.size());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
