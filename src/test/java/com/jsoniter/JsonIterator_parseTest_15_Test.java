package com.jsoniter;

import com.jsoniter.JsonIterator;
import com.jsoniter.spi.Config;
import com.jsoniter.spi.Slice;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JsonIterator_parseTest_15_Test {
  @Test
  public void parseTest() throws Exception {
    // Arrange
    Slice slice = new Slice(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        167772161, 1);

    // Act
    JsonIterator actual = JsonIterator.parse(slice);

    // Assert
    String toStringResult = actual.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, actual.configCache);
    Assert.assertEquals("", actual.readNumberAsString());
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
