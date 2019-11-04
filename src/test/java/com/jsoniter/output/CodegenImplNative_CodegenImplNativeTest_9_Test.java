package com.jsoniter.output;

import com.jsoniter.output.CodegenImplNative;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CodegenImplNative_CodegenImplNativeTest_9_Test {
  @Test
  public void CodegenImplNativeTest() throws Exception {
    // Arrange and Act
    CodegenImplNative codegenImplNative = new CodegenImplNative();

    // Assert
    Assert.assertNotNull(codegenImplNative.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
