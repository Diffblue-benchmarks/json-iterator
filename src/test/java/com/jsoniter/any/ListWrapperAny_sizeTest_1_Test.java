package com.jsoniter.any;

import com.jsoniter.any.ListWrapperAny;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ListWrapperAny_sizeTest_1_Test {
//failed_pass   @Test
//  public void sizeTest() throws Exception {
//    // Arrange
//    ArrayList<Object> arrayList = new ArrayList<Object>();
//    arrayList.add("aaaaa");
//    ListWrapperAny listWrapperAny = new ListWrapperAny(arrayList);
//
//    // Act
//    int actual = listWrapperAny.size();
//
//    // Assert
//    Assert.assertEquals(1, actual);
//    float toFloatResult = listWrapperAny.toFloat();
//    long toLongResult = listWrapperAny.toLong();
//    String toStringResult = listWrapperAny.toString();
//    int toIntResult = listWrapperAny.toInt();
//    boolean toBooleanResult = listWrapperAny.toBoolean();
//    double toDoubleResult = listWrapperAny.toDouble();
//    Assert.assertEquals(1.0f, toFloatResult);
//    Assert.assertEquals(1, listWrapperAny.size());
//    Assert.assertEquals(1.0, toDoubleResult);
//    Assert.assertTrue(toBooleanResult);
//    Assert.assertEquals(1, toIntResult);
//    Assert.assertEquals("[\"aaaaa\"]", toStringResult);
//    Assert.assertEquals(1L, toLongResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
