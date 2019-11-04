package com.jsoniter.any;

import com.jsoniter.any.ListWrapperAny;
import com.jsoniter.any.StringAny;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ListWrapperAny_objectTest_5_Test {
//failed_pass   @Test
//  public void objectTest() throws Exception {
//    // Arrange
//    ArrayList<Object> arrayList = new ArrayList<Object>();
//    arrayList.add("aaaaa");
//    ListWrapperAny listWrapperAny = new ListWrapperAny(arrayList);
//
//    // Act
//    Object actual = listWrapperAny.object();
//
//    // Assert
//    Assert.assertTrue(actual instanceof ArrayList);
//    Assert.assertEquals(1, ((ArrayList) actual).size());
//    Object getResult = ((ArrayList) actual).get(0);
//    Assert.assertTrue(getResult instanceof StringAny);
//    String toStringResult = getResult.toString();
//    Assert.assertEquals("aaaaa", toStringResult);
//    Assert.assertEquals(0, ((StringAny) getResult).size());
//    float toFloatResult = listWrapperAny.toFloat();
//    long toLongResult = listWrapperAny.toLong();
//    String toStringResult1 = listWrapperAny.toString();
//    int toIntResult = listWrapperAny.toInt();
//    boolean toBooleanResult = listWrapperAny.toBoolean();
//    double toDoubleResult = listWrapperAny.toDouble();
//    Assert.assertEquals(1.0f, toFloatResult);
//    Assert.assertEquals(1, listWrapperAny.size());
//    Assert.assertEquals(1.0, toDoubleResult);
//    Assert.assertTrue(toBooleanResult);
//    Assert.assertEquals(1, toIntResult);
//    Assert.assertEquals("[\"aaaaa\"]", toStringResult1);
//    Assert.assertEquals(1L, toLongResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
