package com.jsoniter.output;

import com.jsoniter.output.CodegenResult;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CodegenResult_toStringTest_4_Test {
  @Test
  public void toStringTest() throws Exception {
    // Arrange
    CodegenResult codegenResult = new CodegenResult();

    // Act
    String actual = codegenResult.toString();

    // Assert
    Assert.assertEquals("", actual);
    Assert.assertEquals("", codegenResult.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
