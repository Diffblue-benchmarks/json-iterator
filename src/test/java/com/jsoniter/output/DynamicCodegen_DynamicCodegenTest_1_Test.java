package com.jsoniter.output;

import com.jsoniter.output.DynamicCodegen;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DynamicCodegen_DynamicCodegenTest_1_Test {
  @Test
  public void DynamicCodegenTest() throws Exception {
    // Arrange and Act
    DynamicCodegen dynamicCodegen = new DynamicCodegen();

    // Assert
    Assert.assertNotNull(dynamicCodegen.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
