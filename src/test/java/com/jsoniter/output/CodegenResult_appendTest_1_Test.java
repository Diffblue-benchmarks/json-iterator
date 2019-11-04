package com.jsoniter.output;

import com.jsoniter.output.CodegenResult;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CodegenResult_appendTest_1_Test {
  @Test
  public void appendTest() throws Exception {
    // Arrange
    CodegenResult codegenResult = new CodegenResult();
    String str = "aaaaa";

    // Act
    codegenResult.append(str);

    // Assert
    Assert.assertEquals("aaaaa\n", codegenResult.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
