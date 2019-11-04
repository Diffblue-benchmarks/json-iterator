package com.jsoniter.output;

import com.jsoniter.output.CodegenAccess;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CodegenAccess_CodegenAccessTest_39_Test {
  @Test
  public void CodegenAccessTest() throws Exception {
    // Arrange and Act
    CodegenAccess codegenAccess = new CodegenAccess();

    // Assert
    Assert.assertNotNull(codegenAccess.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
