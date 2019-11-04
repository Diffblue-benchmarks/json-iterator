package com.jsoniter;

import com.jsoniter.Codegen;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Codegen_CodegenTest_7_Test {
  @Test
  public void CodegenTest() throws Exception {
    // Arrange and Act
    Codegen codegen = new Codegen();

    // Assert
    Assert.assertNotNull(codegen.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
