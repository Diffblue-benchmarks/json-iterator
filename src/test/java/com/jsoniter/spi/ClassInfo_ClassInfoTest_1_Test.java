package com.jsoniter.spi;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.spi.ClassInfo;
import java.lang.reflect.Type;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ClassInfo_ClassInfoTest_1_Test {
  @Test
  public void ClassInfoTest() throws Exception {
    // Arrange
    ArrayType arrayType = (ArrayType) null;

    // Act
    ClassInfo classInfo = new ClassInfo(arrayType);

    // Assert
    Assert.assertEquals(null, classInfo.clazz);
    Assert.assertEquals(0, classInfo.typeArgs.length);
    Assert.assertEquals(null, classInfo.type);
    Assert.assertEquals(null, arrayType);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
