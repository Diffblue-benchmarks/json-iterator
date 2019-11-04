package com.jsoniter;

import com.jsoniter.CodegenAccess;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StaticCodegenTarget_CodegenAccess$StaticCodegenTargetTest_1_Test {
  @Test
  public void CodegenAccess$StaticCodegenTargetTest() throws Exception {
    // Arrange
    String outputDir = "aaaaa";

    // Act
    CodegenAccess.StaticCodegenTarget staticCodegenTarget = new CodegenAccess.StaticCodegenTarget(outputDir);

    // Assert
    Assert.assertNotNull(staticCodegenTarget.toString());
    Assert.assertEquals("aaaaa", staticCodegenTarget.outputDir);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
