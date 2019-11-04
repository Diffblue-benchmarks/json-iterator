package com.jsoniter;

import com.jsoniter.CodegenAccess;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CodegenAccess_addMissingFieldTest_17_Test {
  @Test
  public void addMissingFieldTest() throws Exception {
    // Arrange
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("aaaaa");
    long tracker = 1L;
    long mask = 1L;
    String fieldName = "aaaaa";

    // Act
    CodegenAccess.addMissingField(arrayList, tracker, mask, fieldName);

    // Assert
    Assert.assertEquals(1, arrayList.size());
    Object getResult = arrayList.get(0);
    Assert.assertTrue(getResult instanceof String);
    Assert.assertEquals("aaaaa", getResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
