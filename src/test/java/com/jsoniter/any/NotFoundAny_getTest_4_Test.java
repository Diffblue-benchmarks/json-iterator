package com.jsoniter.any;

import com.jsoniter.any.Any;
import com.jsoniter.any.NotFoundAny;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class NotFoundAny_getTest_4_Test {
  @Test
  public void getTest() throws Exception {
    // Arrange
    String string = "aaaaa";
    NotFoundAny notFoundAny = new NotFoundAny(1, string);
    Object[] objectArray = new Object[]{"aaaaa", string, "aakaa"};
    int idx = 1;

    // Act
    Any actual = notFoundAny.get(objectArray, idx);

    // Assert
    Assert.assertSame(notFoundAny, actual);
    Assert.assertTrue(actual instanceof NotFoundAny);
    Assert.assertSame(notFoundAny, actual);
    Assert.assertEquals(3, objectArray.length);
    Object object = objectArray[0];
    Object object1 = objectArray[1];
    Object object2 = objectArray[2];
    Assert.assertTrue(object instanceof String);
    Assert.assertTrue(object2 instanceof String);
    Assert.assertEquals("aaaaa", object);
    Assert.assertEquals("aakaa", object2);
    Assert.assertTrue(object1 instanceof String);
    Assert.assertEquals("aaaaa", object1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
