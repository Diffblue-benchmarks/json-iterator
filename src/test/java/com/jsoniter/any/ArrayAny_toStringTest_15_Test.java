package com.jsoniter.any;

import com.jsoniter.any.Any;
import com.jsoniter.any.ArrayAny;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class ArrayAny_toStringTest_15_Test {
//failed_run   @Test
//  public void toStringTest() throws Exception {
//    // Arrange
//    ArrayList<Any> arrayList = new ArrayList<Any>();
//    arrayList.add(Whitebox.newInstance(Any.class));
//    ArrayAny arrayAny = new ArrayAny(arrayList);
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    arrayAny.toString();
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
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
