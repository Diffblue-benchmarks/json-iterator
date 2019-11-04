package com.jsoniter.any;

import com.jsoniter.any.Any;
import com.jsoniter.any.ObjectAny;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class ObjectAny_toStringTest_14_Test {
//failed_run   @Test
//  public void toStringTest() throws Exception {
//    // Arrange
//    HashMap<String, Any> hashMap = new HashMap<String, Any>();
//    hashMap.put("aaaaa", Whitebox.newInstance(Any.class));
//    ObjectAny objectAny = new ObjectAny(hashMap);
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    objectAny.toString();
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
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
