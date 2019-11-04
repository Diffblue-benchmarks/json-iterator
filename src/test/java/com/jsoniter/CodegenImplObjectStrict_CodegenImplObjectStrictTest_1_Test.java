package com.jsoniter;

import com.jsoniter.CodegenImplObjectStrict;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CodegenImplObjectStrict_CodegenImplObjectStrictTest_1_Test {
  @Test
  public void CodegenImplObjectStrictTest() throws Exception {
    // Arrange and Act
    CodegenImplObjectStrict codegenImplObjectStrict = new CodegenImplObjectStrict();

    // Assert
    Assert.assertNotNull(codegenImplObjectStrict.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
