package com.jsoniter.output;

import com.jsoniter.output.CodegenImplObject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CodegenImplObject_CodegenImplObjectTest_2_Test {
  @Test
  public void CodegenImplObjectTest() throws Exception {
    // Arrange and Act
    CodegenImplObject codegenImplObject = new CodegenImplObject();

    // Assert
    Assert.assertNotNull(codegenImplObject.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
