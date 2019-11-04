package com.jsoniter.output;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.output.ReflectionMapEncoder;
import java.lang.reflect.Type;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReflectionMapEncoder_ReflectionMapEncoderTest_2_Test {
  @Test
  public void ReflectionMapEncoderTest() throws Exception {
    // Arrange
    Class resultClass = (Class) null;
    Type[] typeArray = new Type[]{null, null, null};

    // Act
    ReflectionMapEncoder reflectionMapEncoder = new ReflectionMapEncoder(resultClass, typeArray);

    // Assert
    Assert.assertNotNull(reflectionMapEncoder.toString());
    Assert.assertEquals(null, resultClass);
    Assert.assertEquals(3, typeArray.length);
    Assert.assertEquals(null, typeArray[0]);
    Assert.assertEquals(null, typeArray[2]);
    Assert.assertEquals(null, typeArray[1]);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
