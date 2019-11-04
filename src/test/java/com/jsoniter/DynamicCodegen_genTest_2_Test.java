package com.jsoniter;

import com.jsoniter.DynamicCodegen;
import com.jsoniter.spi.Decoder;
import javassist.CannotCompileException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class DynamicCodegen_genTest_2_Test {
  @Test
  public void genTest() throws Exception {
    // Arrange
    String cacheKey = "aaaaa";
    String source = "aaaaa";

    // Act and Assert
    thrown.expect(CannotCompileException.class);
    DynamicCodegen.gen(cacheKey, source);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
