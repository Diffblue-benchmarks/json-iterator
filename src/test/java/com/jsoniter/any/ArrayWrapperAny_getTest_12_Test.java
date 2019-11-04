package com.jsoniter.any;

import com.jsoniter.any.Any;
import com.jsoniter.any.ArrayWrapperAny;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ArrayWrapperAny_getTest_12_Test {
  @Test
  public void getTest() throws Exception {
    // Arrange
    String string = "aaaaa";
    ArrayWrapperAny arrayWrapperAny = new ArrayWrapperAny(string);
    Object[] objectArray = new Object[]{"aaaaa", string, "aaaaa"};
    int idx = 2561;

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    arrayWrapperAny.get(objectArray, idx);
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
