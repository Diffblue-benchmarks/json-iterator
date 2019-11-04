package com.jsoniter.output;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.output.ReflectionListEncoder;
import java.lang.reflect.Type;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ReflectionListEncoder_ReflectionListEncoderTest_3_Test {
  @Test
  public void ReflectionListEncoderTest() throws Exception {
    // Arrange
    Class resultClass = (Class) null;
    Type[] typeArray = new Type[]{null, null, null};

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    new ReflectionListEncoder(resultClass, typeArray);
    Assert.assertEquals(null, resultClass);
    Assert.assertEquals(3, typeArray.length);
    Assert.assertEquals(null, typeArray[0]);
    Assert.assertEquals(null, typeArray[2]);
    Assert.assertEquals(null, typeArray[1]);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
