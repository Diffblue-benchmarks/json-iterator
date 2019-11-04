package com.jsoniter.output;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.output.MapKeyEncoders;
import com.jsoniter.spi.Encoder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class MapKeyEncoders_registerOrGetExistingTest_1_Test {
  @Test
  public void registerOrGetExistingTest() throws Exception {
    // Arrange
    ArrayType arrayType = (ArrayType) null;

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    MapKeyEncoders.registerOrGetExisting(arrayType);
    Assert.assertEquals(null, arrayType);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
