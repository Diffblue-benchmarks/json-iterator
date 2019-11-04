package com.jsoniter;

import com.jsoniter.CodegenAccess;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CodegenAccess_calcHashTest_12_Test {
  @Test
  public void calcHashTest() throws Exception {
    // Arrange
    String str = "aaaaa";

    // Act
    int actual = CodegenAccess.calcHash(str);

    // Assert
    Assert.assertEquals(-298243320, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
