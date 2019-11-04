package com.jsoniter;

import com.jsoniter.Codegen;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Codegen_canStaticAccessTest_2_Test {
  @Test
  public void canStaticAccessTest() throws Exception {
    // Arrange
    String cacheKey = "aaaaa";

    // Act
    boolean actual = Codegen.canStaticAccess(cacheKey);

    // Assert
    Assert.assertFalse(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
