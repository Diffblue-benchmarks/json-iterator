package com.jsoniter.any;

import com.jsoniter.ValueType;
import com.jsoniter.any.ListWrapperAny;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ListWrapperAny_valueTypeTest_14_Test {
//failed_pass   @Test
//  public void valueTypeTest() throws Exception {
//    // Arrange
//    ArrayList<Object> arrayList = new ArrayList<Object>();
//    arrayList.add("aaaaa");
//    ListWrapperAny listWrapperAny = new ListWrapperAny(arrayList);
//
//    // Act
//    ValueType actual = listWrapperAny.valueType();
//
//    // Assert
//    Assert.assertEquals(ValueType.ARRAY, actual);
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