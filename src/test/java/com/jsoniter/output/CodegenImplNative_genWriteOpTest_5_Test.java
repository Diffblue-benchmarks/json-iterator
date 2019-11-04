package com.jsoniter.output;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.output.CodegenImplNative;
import com.jsoniter.output.CodegenResult;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CodegenImplNative_genWriteOpTest_5_Test {
  @Test
  public void genWriteOpTest() throws Exception {
    // Arrange
    CodegenResult codegenResult = new CodegenResult();
    String code = "aaaaa";
    ArrayType arrayType = (ArrayType) null;
    boolean isNullable = true;

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    CodegenImplNative.genWriteOp(codegenResult, code, arrayType, isNullable);
    Assert.assertEquals("", codegenResult.toString());
    Assert.assertEquals(null, arrayType);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
