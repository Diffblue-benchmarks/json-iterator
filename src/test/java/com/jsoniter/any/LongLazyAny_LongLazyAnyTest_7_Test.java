package com.jsoniter.any;

import com.jsoniter.any.LongLazyAny;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class LongLazyAny_LongLazyAnyTest_7_Test {
  @Test
  public void LongLazyAnyTest() throws Exception {
    // Arrange
    byte[] byteArray = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int head = 1;
    int tail = 655361;

    // Act
    LongLazyAny longLazyAny = new LongLazyAny(byteArray, head, tail);

    // Assert
    Assert.assertEquals(0, longLazyAny.size());
    Assert.assertEquals(24, byteArray.length);
    Assert.assertEquals((byte) 0, byteArray[0]);
    Assert.assertEquals((byte) 0, byteArray[1]);
    Assert.assertEquals((byte) 0, byteArray[2]);
    Assert.assertEquals((byte) 0, byteArray[3]);
    Assert.assertEquals((byte) 0, byteArray[4]);
    Assert.assertEquals((byte) 0, byteArray[5]);
    Assert.assertEquals((byte) 0, byteArray[18]);
    Assert.assertEquals((byte) 0, byteArray[19]);
    Assert.assertEquals((byte) 0, byteArray[20]);
    Assert.assertEquals((byte) 0, byteArray[21]);
    Assert.assertEquals((byte) 0, byteArray[22]);
    Assert.assertEquals((byte) 0, byteArray[23]);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
