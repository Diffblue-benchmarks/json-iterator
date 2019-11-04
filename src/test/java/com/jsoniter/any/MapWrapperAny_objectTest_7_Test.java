package com.jsoniter.any;

import com.jsoniter.any.MapWrapperAny;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MapWrapperAny_objectTest_7_Test {
//failed_pass   @Test
//  public void objectTest() throws Exception {
//    // Arrange
//    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
//    hashMap.put("aaaaa", "aaaaa");
//    MapWrapperAny mapWrapperAny = new MapWrapperAny(hashMap);
//
//    // Act
//    Object actual = mapWrapperAny.object();
//
//    // Assert
//    Assert.assertTrue(actual instanceof HashMap);
//    Assert.assertEquals(1, ((HashMap) actual).size());
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
