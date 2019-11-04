package com.jsoniter.output;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.output.JsonStream;
import java.io.ByteArrayOutputStream;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class JsonStream_serializeTest_2_Test {
  @Test
  public void serializeTest() throws Exception {
    // Arrange
    ArrayType arrayType = (ArrayType) null;
    String obj = "aaaaa";
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    JsonStream.serialize(arrayType, obj, byteArrayOutputStream);
    Assert.assertEquals(null, arrayType);
    String toStringResult = byteArrayOutputStream.toString();
    Assert.assertEquals("", toStringResult);
    Assert.assertEquals(0, byteArrayOutputStream.size());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
