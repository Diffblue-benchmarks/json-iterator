package com.jsoniter.output;

import com.jsoniter.output.JsonStream;
import com.jsoniter.output.JsonStreamPool;
import com.jsoniter.spi.Config;
import com.jsoniter.spi.Slice;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JsonStreamPool_borrowJsonStreamTest_2_Test {
//failed_pass   @Test
//  public void borrowJsonStreamTest() throws Exception {
//    // Arrange and Act
//    JsonStream actual = JsonStreamPool.borrowJsonStream();
//
//    // Assert
//    String toStringResult = actual.toString();
//    Slice bufferResult = actual.buffer();
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(null, actual.configCache);
//    String toStringResult1 = bufferResult.toString();
//    int lenResult = bufferResult.len();
//    int tailResult = bufferResult.tail();
//    byte[] dataResult = bufferResult.data();
//    Assert.assertEquals("", toStringResult1);
//    Assert.assertEquals(512, dataResult.length);
//    Assert.assertEquals((byte) 91, dataResult[0]);
//    Assert.assertEquals((byte) 34, dataResult[1]);
//    Assert.assertEquals((byte) 0, dataResult[510]);
//    Assert.assertEquals((byte) 0, dataResult[511]);
//    Assert.assertEquals(0, tailResult);
//    Assert.assertEquals(0, lenResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
