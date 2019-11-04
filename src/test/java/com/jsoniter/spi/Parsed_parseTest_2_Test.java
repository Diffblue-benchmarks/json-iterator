package com.jsoniter.spi;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.spi.OmitValue;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Parsed_parseTest_2_Test {
  @Test
  public void parseTest() throws Exception {
    // Arrange
    ArrayType arrayType = (ArrayType) null;
    String defaultValueToOmit = "aaaaa";

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    OmitValue.Parsed.parse(arrayType, defaultValueToOmit);
    Assert.assertEquals(null, arrayType);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
