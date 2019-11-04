package com.jsoniter;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.CodegenImplNative;
import com.jsoniter.spi.Binding;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CodegenImplNative_genFieldTest_6_Test {
  @Test
  public void genFieldTest() throws Exception {
    // Arrange
    HashMap<String, Type> hashMap = new HashMap<String, Type>();
    hashMap.put("aaaaa", null);
    Binding binding = (Binding) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    CodegenImplNative.genField(binding);
    Assert.assertEquals(null, binding);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
