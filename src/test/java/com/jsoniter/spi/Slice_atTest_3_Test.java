package com.jsoniter.spi;

import com.jsoniter.spi.Slice;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Slice_atTest_3_Test {
  @Test
  public void atTest() throws Exception {
    // Arrange
    Slice slice = new Slice(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        167772161, 1);
    int pos = 1;

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    slice.at(pos);
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
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
