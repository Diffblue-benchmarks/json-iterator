package com.jsoniter;

import com.jsoniter.CodegenAccess;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CodegenAccess_reuseCollectionTest_23_Test {
  @Test
  public void reuseCollectionTest() throws Exception {
    // Arrange
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("aaaaa");

    // Act
    Collection actual = CodegenAccess.<Collection>reuseCollection(arrayList);

    // Assert
    Assert.assertSame(arrayList, actual);
    Assert.assertTrue(actual instanceof ArrayList);
    Assert.assertSame(arrayList, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
