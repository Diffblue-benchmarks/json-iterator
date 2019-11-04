package com.jsoniter.any;

import com.jsoniter.any.Any;
import com.jsoniter.any.ArrayAny;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class ArrayAny_ArrayAnyTest_10_Test {
//failed_run   @Test
//  public void ArrayAnyTest() throws Exception {
//    // Arrange
//    ArrayList<Any> arrayList = new ArrayList<Any>();
//    Any any = Whitebox.newInstance(Any.class);
//    arrayList.add(any);
//
//    // Act
//    ArrayAny arrayAny = new ArrayAny(arrayList);
//
//    // Assert
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
//    Assert.assertEquals(1, arrayList.size());
//    Assert.assertSame(any, arrayList.get(0));
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
