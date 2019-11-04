package com.jsoniter.output;

import com.jsoniter.output.CodegenResult;
import com.jsoniter.output.DynamicCodegen;
import com.jsoniter.spi.Encoder;
import javassist.CannotCompileException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class DynamicCodegen_genTest_5_Test {
  @Test
  public void genTest() throws Exception {
    // Arrange
    Class resultClass = (Class) null;
    String cacheKey = "aaaaa";
    CodegenResult source = new CodegenResult();

    // Act and Assert
    thrown.expect(CannotCompileException.class);
    DynamicCodegen.gen(resultClass, cacheKey, source);
    Assert.assertEquals(null, resultClass);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
