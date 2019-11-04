package com.jsoniter.any;

import com.jsoniter.any.Any;
import com.jsoniter.any.MapWrapperAny;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MapWrapperAny_getTest_2_Test {
//failed_pass   @Test
//  public void getTest() throws Exception {
//    // Arrange
//    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
//    hashMap.put("aaaaa", "aaaaa");
//    MapWrapperAny mapWrapperAny = new MapWrapperAny(hashMap);
//    String key = "aaaaa";
//
//    // Act
//    Any actual = mapWrapperAny.get(key);
//
//    // Assert
//    Assert.assertTrue(actual instanceof com.jsoniter.any.StringAny);
//    String toStringResult = actual.toString();
//    Assert.assertEquals("aaaaa", toStringResult);
//    Assert.assertEquals(0, actual.size());
//    float toFloatResult = mapWrapperAny.toFloat();
//    long toLongResult = mapWrapperAny.toLong();
//    String toStringResult1 = mapWrapperAny.toString();
//    int toIntResult = mapWrapperAny.toInt();
//    boolean toBooleanResult = mapWrapperAny.toBoolean();
//    double toDoubleResult = mapWrapperAny.toDouble();
//    Assert.assertEquals(1.0f, toFloatResult);
//    Assert.assertEquals(1, mapWrapperAny.size());
//    Assert.assertEquals(1.0, toDoubleResult);
//    Assert.assertTrue(toBooleanResult);
//    Assert.assertEquals(1, toIntResult);
//    Assert.assertEquals("{\"aaaaa\":\"aaaaa\"}", toStringResult1);
//    Assert.assertEquals(1L, toLongResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
