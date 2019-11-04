package com.jsoniter.output;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.output.JsonStream;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class JsonStream_writeValTest_46_Test {
//failed_pass   @Test
//  public void writeValTest() throws Exception {
//    // Arrange
//    JsonStream jsonStream = Whitebox.newInstance(JsonStream.class);
//    ArrayType arrayType = (ArrayType) null;
//    String obj = "aaaaa";
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    jsonStream.<Object>writeVal(arrayType, obj);
//    Assert.assertEquals(null, arrayType);
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
