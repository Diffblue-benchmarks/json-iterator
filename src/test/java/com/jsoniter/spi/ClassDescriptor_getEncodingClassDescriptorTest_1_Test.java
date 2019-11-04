package com.jsoniter.spi;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.spi.ClassDescriptor;
import com.jsoniter.spi.ClassInfo;
import java.lang.reflect.Type;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ClassDescriptor_getEncodingClassDescriptorTest_1_Test {
  @Test
  public void getEncodingClassDescriptorTest() throws Exception {
    // Arrange
    ClassInfo classInfo = new ClassInfo(null);
    boolean includingPrivate = true;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ClassDescriptor.getEncodingClassDescriptor(classInfo, includingPrivate);
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
