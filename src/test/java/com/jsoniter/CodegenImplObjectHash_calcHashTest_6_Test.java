package com.jsoniter;

import com.jsoniter.CodegenImplObjectHash;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CodegenImplObjectHash_calcHashTest_6_Test {
  @Test
  public void calcHashTest() throws Exception {
    // Arrange
    String fromName = "aaaaa";

    // Act
    int actual = CodegenImplObjectHash.calcHash(fromName);

    // Assert
    Assert.assertEquals(-298243320, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
