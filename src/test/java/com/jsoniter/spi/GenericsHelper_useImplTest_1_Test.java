package com.jsoniter.spi;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.spi.GenericsHelper;
import com.jsoniter.spi.JsonException;
import java.lang.reflect.Type;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class GenericsHelper_useImplTest_1_Test {
  @Test
  public void useImplTest() throws Exception {
    // Arrange
    ArrayType arrayType = (ArrayType) null;
    Class resultClass = (Class) null;

    // Act and Assert
    thrown.expect(JsonException.class);
    GenericsHelper.useImpl(arrayType, resultClass);
    Assert.assertEquals(null, arrayType);
    Assert.assertEquals(null, resultClass);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
