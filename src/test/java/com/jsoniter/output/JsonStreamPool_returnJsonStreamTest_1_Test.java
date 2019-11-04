package com.jsoniter.output;

import com.jsoniter.output.JsonStream;
import com.jsoniter.output.JsonStreamPool;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class JsonStreamPool_returnJsonStreamTest_1_Test {
  @Test
  public void returnJsonStreamTest() throws Exception {
    // Arrange
    JsonStream jsonStream = (JsonStream) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    JsonStreamPool.returnJsonStream(jsonStream);
    Assert.assertEquals(null, jsonStream);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
