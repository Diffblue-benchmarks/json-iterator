package com.jsoniter.output;

import com.jsoniter.output.CodegenResult;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CodegenResult_generateWrapperCodeTest_3_Test {
  @Test
  public void generateWrapperCodeTest() throws Exception {
    // Arrange
    CodegenResult codegenResult = new CodegenResult();
    Class resultClass = (Class) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    codegenResult.generateWrapperCode(resultClass);
    Assert.assertEquals(null, resultClass);
    Assert.assertEquals("", codegenResult.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
