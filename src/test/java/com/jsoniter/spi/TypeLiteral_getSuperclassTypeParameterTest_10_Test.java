package com.jsoniter.spi;

import com.jsoniter.spi.TypeLiteral;
import java.lang.reflect.Type;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TypeLiteral_getSuperclassTypeParameterTest_10_Test {
  @Test
  public void getSuperclassTypeParameterTest() throws Exception {
    // Arrange
    Class<Object> resultClass = (Class<Object>) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    TypeLiteral.getSuperclassTypeParameter(resultClass);
    Assert.assertEquals(null, resultClass);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
