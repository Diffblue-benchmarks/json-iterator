package com.jsoniter.spi;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.spi.Binding;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class Binding_getAnnotationTest_5_Test {
  @Test
  public void getAnnotationTest() throws Exception {
    // Arrange
    HashMap<String, Type> hashMap = new HashMap<String, Type>();
    hashMap.put("aaaaa", null);
    Binding binding = Whitebox.newInstance(Binding.class);
    Class<Annotation> resultClass = (Class<Annotation>) null;

    // Act
    Annotation actual = binding.<Annotation>getAnnotation(resultClass);

    // Assert
    Assert.assertEquals(null, actual);
    Assert.assertEquals(null, resultClass);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
