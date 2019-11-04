package com.jsoniter.spi;

import com.jsoniter.spi.Slice;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Slice_headTest_8_Test {
  @Test
  public void headTest() throws Exception {
    // Arrange
    Slice slice = new Slice(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        167772161, 1);

    // Act
    int actual = slice.head();

    // Assert
    Assert.assertEquals(167772161, actual);
    int lenResult = slice.len();
    int tailResult = slice.tail();
    byte[] dataResult = slice.data();
    Assert.assertEquals(-167772160, lenResult);
    Assert.assertEquals(24, dataResult.length);
    Assert.assertEquals((byte) 0, dataResult[0]);
    Assert.assertEquals((byte) 0, dataResult[1]);
    Assert.assertEquals((byte) 0, dataResult[2]);
    Assert.assertEquals((byte) 0, dataResult[21]);
    Assert.assertEquals((byte) 0, dataResult[22]);
    Assert.assertEquals((byte) 0, dataResult[23]);
    Assert.assertEquals(1, tailResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
