package com.jsoniter.spi;

import com.jsoniter.spi.Slice;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Slice_makeTest_4_Test {
  @Test
  public void makeTest() throws Exception {
    // Arrange
    String str = "aaaaa";

    // Act
    Slice actual = Slice.make(str);

    // Assert
    String toStringResult = actual.toString();
    int lenResult = actual.len();
    int tailResult = actual.tail();
    byte[] dataResult = actual.data();
    Assert.assertEquals("aaaaa", toStringResult);
    Assert.assertEquals(5, dataResult.length);
    Assert.assertArrayEquals(new byte[]{97, 97, 97, 97, 97}, dataResult);
    Assert.assertEquals(5, tailResult);
    Assert.assertEquals(5, lenResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
