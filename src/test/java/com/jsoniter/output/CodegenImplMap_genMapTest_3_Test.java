package com.jsoniter.output;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.output.CodegenImplMap;
import com.jsoniter.output.CodegenResult;
import com.jsoniter.spi.ClassInfo;
import java.lang.reflect.Type;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CodegenImplMap_genMapTest_3_Test {
  @Test
  public void genMapTest() throws Exception {
    // Arrange
    String cacheKey = "aaaaa";
    ClassInfo classInfo = new ClassInfo(null);

    // Act
    CodegenResult actual = CodegenImplMap.genMap(cacheKey, classInfo);

    // Assert
    Assert.assertEquals(
        "public static void encode_(java.lang.Object obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {\nif (obj == null) { stream.writeNull(); return; }\njava.util.Map map = (java.util.Map)obj;\njava.util.Iterator iter = map.entrySet().iterator();\nif(!iter.hasNext()) { return; }\njava.util.Map.Entry entry = (java.util.Map.Entry)iter.next();\nstream.writeObjectField(entry.getKey());\nif (entry.getValue() == null) { stream.writeNull(); } else {\nstream.writeVal((java.lang.Object)entry.getValue());\n}\nwhile(iter.hasNext()) {\nentry = (java.util.Map.Entry)iter.next();\nstream.write(',');\nstream.writeObjectField(entry.getKey());\nif (entry.getValue() == null) { stream.writeNull(); } else {\nstream.writeVal((java.lang.Object)entry.getValue());\n}\n}\n}\n",
        actual.toString());
    Assert.assertNotNull(classInfo.toString());
    Assert.assertEquals(0, classInfo.typeArgs.length);
    Assert.assertEquals(null, classInfo.type);
    Assert.assertEquals(null, classInfo.clazz);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
