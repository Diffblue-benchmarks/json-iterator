package com.jsoniter.any;

import com.jsoniter.ValueType;
import com.jsoniter.any.MapWrapperAny;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MapWrapperAny_valueTypeTest_6_Test {
//failed_pass   @Test
//  public void valueTypeTest() throws Exception {
//    // Arrange
//    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
//    hashMap.put("aaaaa", "aaaaa");
//    MapWrapperAny mapWrapperAny = new MapWrapperAny(hashMap);
//
//    // Act
//    ValueType actual = mapWrapperAny.valueType();
//
//    // Assert
//    Assert.assertEquals(ValueType.OBJECT, actual);
//    float toFloatResult = mapWrapperAny.toFloat();
//    long toLongResult = mapWrapperAny.toLong();
//    int toIntResult = mapWrapperAny.toInt();
//    boolean toBooleanResult = mapWrapperAny.toBoolean();
//    double toDoubleResult = mapWrapperAny.toDouble();
//    Assert.assertEquals(1.0f, toFloatResult);
//    Assert.assertEquals(1, mapWrapperAny.size());
//    Assert.assertEquals(1.0, toDoubleResult);
//    Assert.assertTrue(toBooleanResult);
//    Assert.assertEquals(1, toIntResult);
//    Assert.assertEquals(1L, toLongResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
