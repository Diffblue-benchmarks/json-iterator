package com.jsoniter.any;

import com.jsoniter.ValueType;
import com.jsoniter.any.Any;
import com.jsoniter.any.ArrayAny;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class ArrayAny_valueTypeTest_7_Test {
//failed_run   @Test
//  public void valueTypeTest() throws Exception {
//    // Arrange
//    ArrayList<Any> arrayList = new ArrayList<Any>();
//    arrayList.add(Whitebox.newInstance(Any.class));
//    ArrayAny arrayAny = new ArrayAny(arrayList);
//
//    // Act
//    ValueType actual = arrayAny.valueType();
//
//    // Assert
//    Assert.assertEquals(ValueType.ARRAY, actual);
//    float toFloatResult = arrayAny.toFloat();
//    long toLongResult = arrayAny.toLong();
//    int toIntResult = arrayAny.toInt();
//    boolean toBooleanResult = arrayAny.toBoolean();
//    double toDoubleResult = arrayAny.toDouble();
//    Assert.assertEquals(1.0f, toFloatResult);
//    Assert.assertEquals(1, arrayAny.size());
//    Assert.assertEquals(1.0, toDoubleResult);
//    Assert.assertTrue(toBooleanResult);
//    Assert.assertEquals(1, toIntResult);
//    Assert.assertEquals(1L, toLongResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
