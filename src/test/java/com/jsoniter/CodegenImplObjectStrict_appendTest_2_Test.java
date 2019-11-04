package com.jsoniter;

import com.jsoniter.CodegenImplObjectStrict;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CodegenImplObjectStrict_appendTest_2_Test {
  @Test
  public void appendTest() throws Exception {
    // Arrange
    StringBuilder stringBuilder = new StringBuilder();
    String str = "aaaaa";

    // Act
    CodegenImplObjectStrict.append(stringBuilder, str);

    // Assert
    int capacityResult = stringBuilder.capacity();
    String toStringResult = stringBuilder.toString();
    Assert.assertEquals(16, capacityResult);
    Assert.assertEquals(6, stringBuilder.length());
    Assert.assertEquals("aaaaa\n", toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
