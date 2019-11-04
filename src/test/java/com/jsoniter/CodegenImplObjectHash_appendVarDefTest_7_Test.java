package com.jsoniter;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.CodegenImplObjectHash;
import com.jsoniter.spi.Binding;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CodegenImplObjectHash_appendVarDefTest_7_Test {
//failed_compile   @Test
//  public void appendVarDefTest() throws Exception {
//    // Arrange
//    StringBuilder stringBuilder = new StringBuilder();
//    HashMap<String, Type> hashMap = new HashMap<String, Type>();
//    hashMap.put("aaaaa", null);
//    Binding binding = (Binding) null;
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    CodegenImplObjectHash.appendVarDef(stringBuilder, binding);
//    char[] value = stringBuilder.getValue();
//    int capacityResult = stringBuilder.capacity();
//    String toStringResult = stringBuilder.toString();
//    Assert.assertEquals(16, value.length);
//    Assert.assertEquals('\u0000', value[0]);
//    Assert.assertEquals('\u0000', value[1]);
//    Assert.assertEquals('\u0000', value[2]);
//    Assert.assertEquals('\u0000', value[13]);
//    Assert.assertEquals('\u0000', value[14]);
//    Assert.assertEquals('\u0000', value[15]);
//    Assert.assertEquals(0, stringBuilder.length());
//    Assert.assertEquals("", toStringResult);
//    Assert.assertEquals(16, capacityResult);
//    Assert.assertEquals(null, binding);
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
