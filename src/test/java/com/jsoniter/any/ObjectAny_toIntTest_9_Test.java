package com.jsoniter.any;

import com.jsoniter.any.Any;
import com.jsoniter.any.ObjectAny;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class ObjectAny_toIntTest_9_Test {
//failed_run   @Test
//  public void toIntTest() throws Exception {
//    // Arrange
//    HashMap<String, Any> hashMap = new HashMap<String, Any>();
//    hashMap.put("aaaaa", Whitebox.newInstance(Any.class));
//    ObjectAny objectAny = new ObjectAny(hashMap);
//
//    // Act
//    int actual = objectAny.toInt();
//
//    // Assert
//    Assert.assertEquals(0, actual);
//    float toFloatResult = objectAny.toFloat();
//    long toLongResult = objectAny.toLong();
//    int toIntResult = objectAny.toInt();
//    Any.EntryIterator entriesResult = objectAny.entries();
//    boolean toBooleanResult = objectAny.toBoolean();
//    double toDoubleResult = objectAny.toDouble();
//    Assert.assertEquals(0.0f, toFloatResult);
//    Assert.assertEquals(0, objectAny.size());
//    Assert.assertEquals(0.0, toDoubleResult);
//    Assert.assertTrue(toBooleanResult);
//    Assert.assertTrue(entriesResult instanceof ObjectAny.IteratorAdapter);
//    Assert.assertEquals(0, toIntResult);
//    Assert.assertEquals(0L, toLongResult);
//    Assert.assertNotNull(((ObjectAny.IteratorAdapter) entriesResult).toString());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
