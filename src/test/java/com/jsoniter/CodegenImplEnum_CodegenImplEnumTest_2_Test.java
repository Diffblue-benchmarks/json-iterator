package com.jsoniter;

import com.jsoniter.CodegenImplEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CodegenImplEnum_CodegenImplEnumTest_2_Test {
  @Test
  public void CodegenImplEnumTest() throws Exception {
    // Arrange and Act
    CodegenImplEnum codegenImplEnum = new CodegenImplEnum();

    // Assert
    Assert.assertNotNull(codegenImplEnum.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
