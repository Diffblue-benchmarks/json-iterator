package com.jsoniter.static_codegen;

import com.jsoniter.static_codegen.StaticCodegen;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StaticCodegen_StaticCodegenTest_2_Test {
  @Test
  public void StaticCodegenTest() throws Exception {
    // Arrange and Act
    StaticCodegen staticCodegen = new StaticCodegen();

    // Assert
    Assert.assertNotNull(staticCodegen.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
