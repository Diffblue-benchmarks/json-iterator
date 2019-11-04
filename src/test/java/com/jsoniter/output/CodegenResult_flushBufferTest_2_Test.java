package com.jsoniter.output;

import com.jsoniter.output.CodegenResult;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CodegenResult_flushBufferTest_2_Test {
  @Test
  public void flushBufferTest() throws Exception {
    // Arrange
    CodegenResult codegenResult = new CodegenResult();

    // Act
    codegenResult.flushBuffer();

    // Assert
    Assert.assertEquals("", codegenResult.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
