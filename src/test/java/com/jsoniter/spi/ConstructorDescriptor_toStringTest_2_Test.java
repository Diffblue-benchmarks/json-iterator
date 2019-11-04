package com.jsoniter.spi;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.extra.GsonCompatibilityMode;
import com.jsoniter.spi.Binding;
import com.jsoniter.spi.ConstructorDescriptor;
import com.jsoniter.spi.Extension;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ConstructorDescriptor_toStringTest_2_Test {
  @Test
  public void toStringTest() throws Exception {
    // Arrange
    ConstructorDescriptor constructorDescriptor = new ConstructorDescriptor();
    constructorDescriptor.ctor = (Constructor) null;
    constructorDescriptor.objectFactory = (GsonCompatibilityMode) null;
    ArrayList<Binding> arrayList = new ArrayList<Binding>();
    HashMap<String, Type> hashMap = new HashMap<String, Type>();
    hashMap.put("aaaak", null);
    arrayList.add(null);
    constructorDescriptor.parameters = arrayList;
    constructorDescriptor.staticFactory = (Method) null;
    constructorDescriptor.staticMethodName = "aaaaa";

    // Act
    String actual = constructorDescriptor.toString();

    // Assert
    Assert.assertEquals(
        "ConstructorDescriptor{staticMethodName='aaaaa', ctor=null, staticFactory=null, parameters=[null]}", actual);
    List<Binding> list = constructorDescriptor.parameters;
    Assert.assertEquals(
        "ConstructorDescriptor{staticMethodName='aaaaa', ctor=null, staticFactory=null, parameters=[null]}",
        constructorDescriptor.toString());
    Assert.assertEquals(null, constructorDescriptor.objectFactory);
    Assert.assertSame(arrayList, list);
    Assert.assertTrue(list instanceof ArrayList);
    Assert.assertEquals(null, constructorDescriptor.staticFactory);
    Assert.assertSame(arrayList, list);
    Assert.assertEquals(null, constructorDescriptor.ctor);
    Assert.assertEquals("aaaaa", constructorDescriptor.staticMethodName);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
