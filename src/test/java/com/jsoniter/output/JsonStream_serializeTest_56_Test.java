package com.jsoniter.output;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.output.JsonStream;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class JsonStream_serializeTest_56_Test {
  @Test
  public void serializeTest() throws Exception {
    // Arrange
    boolean escapeUnicode = true;
    ArrayType arrayType = (ArrayType) null;
    String obj = "aaaaa";

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    JsonStream.serialize(escapeUnicode, arrayType, obj);
    Assert.assertEquals(null, arrayType);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
