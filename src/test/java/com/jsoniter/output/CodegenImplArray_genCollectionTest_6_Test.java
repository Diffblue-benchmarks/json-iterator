package com.jsoniter.output;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.output.CodegenImplArray;
import com.jsoniter.output.CodegenResult;
import com.jsoniter.spi.ClassInfo;
import java.lang.reflect.Type;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CodegenImplArray_genCollectionTest_6_Test {
  @Test
  public void genCollectionTest() throws Exception {
    // Arrange
    String cacheKey = "aaaaa";
    ClassInfo classInfo = new ClassInfo(null);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    CodegenImplArray.genCollection(cacheKey, classInfo);
    Assert.assertNotNull(classInfo.toString());
    Assert.assertEquals(0, classInfo.typeArgs.length);
    Assert.assertEquals(null, classInfo.type);
    Assert.assertEquals(null, classInfo.clazz);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
