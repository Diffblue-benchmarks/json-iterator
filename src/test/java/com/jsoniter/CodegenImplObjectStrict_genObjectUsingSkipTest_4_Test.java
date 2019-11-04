package com.jsoniter;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.CodegenImplObjectStrict;
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
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CodegenImplObjectStrict_genObjectUsingSkipTest_4_Test {
  @Test
  public void genObjectUsingSkipTest() throws Exception {
    // Arrange
    Class resultClass = (Class) null;
    ConstructorDescriptor constructorDescriptor = new ConstructorDescriptor();
    constructorDescriptor.ctor = (Constructor) null;
    constructorDescriptor.objectFactory = (GsonCompatibilityMode) null;
    ArrayList<Binding> arrayList = new ArrayList<Binding>();
    HashMap<String, Type> hashMap = new HashMap<String, Type>();
    hashMap.put("aakaa", null);
    arrayList.add(null);
    constructorDescriptor.parameters = arrayList;
    constructorDescriptor.staticFactory = (Method) null;
    constructorDescriptor.staticMethodName = "aaaaa";

    // Act and Assert
    thrown.expect(NullPointerException.class);
    CodegenImplObjectStrict.genObjectUsingSkip(resultClass, constructorDescriptor);
    Assert.assertEquals(null, resultClass);
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
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
