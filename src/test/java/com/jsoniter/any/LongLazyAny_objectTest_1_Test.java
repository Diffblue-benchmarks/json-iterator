package com.jsoniter.any;

import com.jsoniter.any.LongLazyAny;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class LongLazyAny_objectTest_1_Test {
  @Test
  public void objectTest() throws Exception {
    // Arrange
    LongLazyAny longLazyAny = new LongLazyAny(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 167772161, 1);

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    longLazyAny.object();
    Assert.assertEquals(0, longLazyAny.size());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
