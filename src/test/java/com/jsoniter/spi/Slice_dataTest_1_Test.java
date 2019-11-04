package com.jsoniter.spi;

import com.jsoniter.spi.Slice;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Slice_dataTest_1_Test {
  @Test
  public void dataTest() throws Exception {
    // Arrange
    Slice slice = new Slice(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        167772161, 1);

    // Act
    byte[] actual = slice.data();

    // Assert
    Assert.assertEquals(24, actual.length);
    Assert.assertEquals((byte) 0, actual[0]);
    Assert.assertEquals((byte) 0, actual[1]);
    Assert.assertEquals((byte) 0, actual[2]);
    Assert.assertEquals((byte) 0, actual[3]);
    Assert.assertEquals((byte) 0, actual[4]);
    Assert.assertEquals((byte) 0, actual[5]);
    Assert.assertEquals((byte) 0, actual[18]);
    Assert.assertEquals((byte) 0, actual[19]);
    Assert.assertEquals((byte) 0, actual[20]);
    Assert.assertEquals((byte) 0, actual[21]);
    Assert.assertEquals((byte) 0, actual[22]);
    Assert.assertEquals((byte) 0, actual[23]);
    int lenResult = slice.len();
    int tailResult = slice.tail();
    Assert.assertEquals(-167772160, lenResult);
    Assert.assertSame(actual, slice.data());
    Assert.assertEquals(1, tailResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
