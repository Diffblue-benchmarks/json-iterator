package com.jsoniter.output;

import com.jsoniter.output.CodegenResult;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CodegenResult_bufferToWriteOpTest_8_Test {
  @Test
  public void bufferToWriteOpTest() throws Exception {
    // Arrange
    String buffered = "aaaaa";

    // Act
    String actual = CodegenResult.bufferToWriteOp(buffered);

    // Assert
    Assert.assertEquals("stream.writeRaw(\"aaaaa\", 5);", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
