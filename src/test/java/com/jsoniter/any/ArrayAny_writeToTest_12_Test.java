package com.jsoniter.any;

import com.jsoniter.any.Any;
import com.jsoniter.any.ArrayAny;
import com.jsoniter.output.JsonStream;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class ArrayAny_writeToTest_12_Test {
//failed_run   @Test
//  public void writeToTest() throws Exception {
//    // Arrange
//    ArrayList<Any> arrayList = new ArrayList<Any>();
//    arrayList.add(Whitebox.newInstance(Any.class));
//    ArrayAny arrayAny = new ArrayAny(arrayList);
//    JsonStream jsonStream = (JsonStream) null;
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    arrayAny.writeTo(jsonStream);
//    Assert.assertEquals(null, jsonStream);
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
