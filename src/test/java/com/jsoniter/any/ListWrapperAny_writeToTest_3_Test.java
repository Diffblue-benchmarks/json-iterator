package com.jsoniter.any;

import com.jsoniter.any.ListWrapperAny;
import com.jsoniter.output.JsonStream;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ListWrapperAny_writeToTest_3_Test {
  @Test
  public void writeToTest() throws Exception {
    // Arrange
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("aaaaa");
    ListWrapperAny listWrapperAny = new ListWrapperAny(arrayList);
    JsonStream jsonStream = (JsonStream) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    listWrapperAny.writeTo(jsonStream);
    Assert.assertEquals(null, jsonStream);
    float toFloatResult = listWrapperAny.toFloat();
    long toLongResult = listWrapperAny.toLong();
    int toIntResult = listWrapperAny.toInt();
    boolean toBooleanResult = listWrapperAny.toBoolean();
    double toDoubleResult = listWrapperAny.toDouble();
    Assert.assertEquals(1.0f, toFloatResult);
    Assert.assertEquals(1, listWrapperAny.size());
    Assert.assertEquals(1.0, toDoubleResult);
    Assert.assertTrue(toBooleanResult);
    Assert.assertEquals(1, toIntResult);
    Assert.assertEquals(1L, toLongResult);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
