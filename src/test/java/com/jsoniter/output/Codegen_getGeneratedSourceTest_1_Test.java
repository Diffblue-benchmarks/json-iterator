package com.jsoniter.output;

import com.jsoniter.output.Codegen;
import com.jsoniter.output.CodegenResult;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Codegen_getGeneratedSourceTest_1_Test {
  @Test
  public void getGeneratedSourceTest() throws Exception {
    // Arrange
    String cacheKey = "aaaaa";

    // Act
    CodegenResult actual = Codegen.getGeneratedSource(cacheKey);

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
