package com.jsoniter.any;

import com.jsoniter.any.ListWrapperAny;
import java.math.BigDecimal;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ListWrapperAny_toBigDecimalTest_15_Test {
//failed_pass   @Test
//  public void toBigDecimalTest() throws Exception {
//    // Arrange
//    ArrayList<Object> arrayList = new ArrayList<Object>();
//    arrayList.add("aaaaa");
//    ListWrapperAny listWrapperAny = new ListWrapperAny(arrayList);
//
//    // Act
//    BigDecimal actual = listWrapperAny.toBigDecimal();
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
//    float toFloatResult = listWrapperAny.toFloat();
//    long toLongResult = listWrapperAny.toLong();
//    int toIntResult = listWrapperAny.toInt();
//    boolean toBooleanResult = listWrapperAny.toBoolean();
//    double toDoubleResult = listWrapperAny.toDouble();
//    Assert.assertEquals(1.0f, toFloatResult);
//    Assert.assertEquals(1, listWrapperAny.size());
//    Assert.assertEquals(1.0, toDoubleResult);
//    Assert.assertTrue(toBooleanResult);
//    Assert.assertEquals(1, toIntResult);
//    Assert.assertEquals(1L, toLongResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
