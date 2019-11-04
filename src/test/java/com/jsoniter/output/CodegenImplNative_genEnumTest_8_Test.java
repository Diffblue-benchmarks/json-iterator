package com.jsoniter.output;

import com.jsoniter.output.CodegenImplNative;
import com.jsoniter.output.CodegenResult;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CodegenImplNative_genEnumTest_8_Test {
  @Test
  public void genEnumTest() throws Exception {
    // Arrange
    Class resultClass = (Class) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    CodegenImplNative.genEnum(resultClass);
    Assert.assertEquals(null, resultClass);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
