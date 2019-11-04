package com.jsoniter.output;

import com.jsoniter.output.CodegenResult;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CodegenResult_bufferTest_9_Test {
  @Test
  public void bufferTest() throws Exception {
    // Arrange
    CodegenResult codegenResult = new CodegenResult();
    char c = 'c';

    // Act
    codegenResult.buffer(c);

    // Assert
    Assert.assertEquals("", codegenResult.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
