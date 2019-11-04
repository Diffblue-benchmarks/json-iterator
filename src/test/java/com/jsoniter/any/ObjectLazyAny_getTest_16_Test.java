package com.jsoniter.any;

import com.jsoniter.any.Any;
import com.jsoniter.any.ObjectLazyAny;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ObjectLazyAny_getTest_16_Test {
  @Test
  public void getTest() throws Exception {
    // Arrange
    ObjectLazyAny objectLazyAny = new ObjectLazyAny(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 167772161, 1);
    Object[] objectArray = new Object[]{"aaaaa", "aaaaa", "aaaaa"};
    int idx = 11;

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    objectLazyAny.get(objectArray, idx);
    Assert.assertEquals(3, objectArray.length);
    Object object = objectArray[0];
    Object object1 = objectArray[1];
    Object object2 = objectArray[2];
    Assert.assertTrue(object instanceof String);
    Assert.assertTrue(object2 instanceof String);
    Assert.assertEquals("aaaaa", object);
    Assert.assertEquals("aaaaa", object2);
    Assert.assertTrue(object1 instanceof String);
    Assert.assertEquals("aaaaa", object1);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
