package com.jsoniter.spi;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.spi.GenericsHelper;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class GenericsHelper_createParameterizedTypeTest_3_Test {
  @Test
  public void createParameterizedTypeTest() throws Exception {
    // Arrange
    Type[] typeArray = new Type[]{null, null, null};
    ArrayType arrayType = (ArrayType) null;
    ArrayType arrayType1 = (ArrayType) null;

    // Act
    GenericsHelper.createParameterizedType(typeArray, arrayType, arrayType1);

    // Assert
    Assert.assertEquals(3, typeArray.length);
    Assert.assertEquals(null, typeArray[0]);
    Assert.assertEquals(null, typeArray[2]);
    Assert.assertEquals(null, typeArray[1]);
    Assert.assertEquals(null, arrayType);
    Assert.assertEquals(null, arrayType1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
