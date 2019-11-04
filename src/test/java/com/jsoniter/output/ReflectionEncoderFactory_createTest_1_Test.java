package com.jsoniter.output;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.output.ReflectionEncoderFactory;
import com.jsoniter.spi.ClassInfo;
import com.jsoniter.spi.Encoder;
import java.lang.reflect.Type;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ReflectionEncoderFactory_createTest_1_Test {
  @Test
  public void createTest() throws Exception {
    // Arrange
    ClassInfo classInfo = new ClassInfo(null);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ReflectionEncoderFactory.create(classInfo);
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
