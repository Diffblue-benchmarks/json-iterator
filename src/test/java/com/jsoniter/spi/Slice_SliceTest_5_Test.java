package com.jsoniter.spi;

import com.jsoniter.spi.Slice;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Slice_SliceTest_5_Test {
  @Test
  public void SliceTest() throws Exception {
    // Arrange
    byte[] byteArray = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int head = 1;
    int tail = 655361;

    // Act
    Slice slice = new Slice(byteArray, head, tail);

    // Assert
    int lenResult = slice.len();
    int tailResult = slice.tail();
    byte[] dataResult = slice.data();
    Assert.assertEquals(655360, lenResult);
    Assert.assertEquals(24, dataResult.length);
    Assert.assertEquals((byte) 0, dataResult[0]);
    Assert.assertEquals((byte) 0, dataResult[1]);
    Assert.assertEquals((byte) 0, dataResult[2]);
    Assert.assertEquals((byte) 0, dataResult[21]);
    Assert.assertEquals((byte) 0, dataResult[22]);
    Assert.assertEquals((byte) 0, dataResult[23]);
    Assert.assertEquals(655361, tailResult);
    Assert.assertSame(dataResult, byteArray);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
