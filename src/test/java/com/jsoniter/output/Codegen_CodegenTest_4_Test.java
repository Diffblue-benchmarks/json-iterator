package com.jsoniter.output;

import com.jsoniter.output.Codegen;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Codegen_CodegenTest_4_Test {
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
