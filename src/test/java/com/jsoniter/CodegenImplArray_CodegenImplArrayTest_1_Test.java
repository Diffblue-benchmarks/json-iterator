package com.jsoniter;

import com.jsoniter.CodegenImplArray;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CodegenImplArray_CodegenImplArrayTest_1_Test {
  @Test
  public void CodegenImplArrayTest() throws Exception {
    // Arrange and Act
    CodegenImplArray codegenImplArray = new CodegenImplArray();

    // Assert
    Assert.assertNotNull(codegenImplArray.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
