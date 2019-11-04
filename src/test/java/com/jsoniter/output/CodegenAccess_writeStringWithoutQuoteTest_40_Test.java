package com.jsoniter.output;

import com.jsoniter.output.CodegenAccess;
import com.jsoniter.output.JsonStream;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CodegenAccess_writeStringWithoutQuoteTest_40_Test {
  @Test
  public void writeStringWithoutQuoteTest() throws Exception {
    // Arrange
    String obj = "aaaaa";
    JsonStream jsonStream = (JsonStream) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    CodegenAccess.writeStringWithoutQuote(obj, jsonStream);
    Assert.assertEquals(null, jsonStream);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
