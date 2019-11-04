package com.jsoniter;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.MapKeyDecoders;
import com.jsoniter.spi.Decoder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class MapKeyDecoders_registerOrGetExistingTest_2_Test {
  @Test
  public void registerOrGetExistingTest() throws Exception {
    // Arrange
    ArrayType arrayType = (ArrayType) null;

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    MapKeyDecoders.registerOrGetExisting(arrayType);
    Assert.assertEquals(null, arrayType);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
