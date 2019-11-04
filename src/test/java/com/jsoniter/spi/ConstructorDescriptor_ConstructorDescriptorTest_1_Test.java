package com.jsoniter.spi;

import com.jsoniter.spi.Binding;
import com.jsoniter.spi.ConstructorDescriptor;
import com.jsoniter.spi.Extension;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ConstructorDescriptor_ConstructorDescriptorTest_1_Test {
  @Test
  public void ConstructorDescriptorTest() throws Exception {
    // Arrange and Act
    ConstructorDescriptor constructorDescriptor = new ConstructorDescriptor();

    // Assert
    String string = constructorDescriptor.staticMethodName;
    Constructor constructor = constructorDescriptor.ctor;
    List<Binding> list = constructorDescriptor.parameters;
    Assert.assertEquals("ConstructorDescriptor{staticMethodName='null', ctor=null, staticFactory=null, parameters=[]}",
        constructorDescriptor.toString());
    Assert.assertEquals(null, constructorDescriptor.objectFactory);
    Assert.assertTrue(list instanceof java.util.ArrayList);
    Assert.assertEquals(null, constructorDescriptor.staticFactory);
    Assert.assertEquals(0, list.size());
    Assert.assertEquals(null, constructor);
    Assert.assertEquals(null, string);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
