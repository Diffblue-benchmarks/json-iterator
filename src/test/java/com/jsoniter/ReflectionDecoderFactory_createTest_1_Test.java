package com.jsoniter;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.ReflectionDecoderFactory;
import com.jsoniter.spi.ClassInfo;
import com.jsoniter.spi.Decoder;
import java.lang.reflect.Type;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ReflectionDecoderFactory_createTest_1_Test {
  @Test
  public void createTest() throws Exception {
    // Arrange
    ClassInfo classInfo = new ClassInfo(null);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ReflectionDecoderFactory.create(classInfo);
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
