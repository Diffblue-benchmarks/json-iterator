package com.jsoniter.output;

import com.jsoniter.output.CodegenImplMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CodegenImplMap_CodegenImplMapTest_1_Test {
  @Test
  public void CodegenImplMapTest() throws Exception {
    // Arrange and Act
    CodegenImplMap codegenImplMap = new CodegenImplMap();

    // Assert
    Assert.assertNotNull(codegenImplMap.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
