package com.jsoniter.any;

import com.jsoniter.any.MapWrapperAny;
import java.math.BigDecimal;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MapWrapperAny_toBigDecimalTest_9_Test {
//failed_pass   @Test
//  public void toBigDecimalTest() throws Exception {
//    // Arrange
//    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
//    hashMap.put("aaaaa", "aaaaa");
//    MapWrapperAny mapWrapperAny = new MapWrapperAny(hashMap);
//
//    // Act
//    BigDecimal actual = mapWrapperAny.toBigDecimal();
//
//    // Assert
//    int scaleResult = actual.scale();
//    String toStringResult = actual.toString();
//    BigDecimal plusResult = actual.plus();
//    BigDecimal absResult = actual.abs();
//    Assert.assertEquals(0, scaleResult);
//    Assert.assertEquals(1, actual.signum());
//    Assert.assertSame(actual, absResult);
//    Assert.assertSame(actual, plusResult);
//    Assert.assertEquals("1", toStringResult);
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
