package com.jsoniter.output;

import com.jsoniter.output.CodegenResult;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CodegenResult_bufferTest_5_Test {
  @Test
  public void bufferTest() throws Exception {
    // Arrange
    CodegenResult codegenResult = new CodegenResult();
    String s = "aaaaa";

    // Act
    codegenResult.buffer(s);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
