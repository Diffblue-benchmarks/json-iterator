package com.jsoniter.output;

import com.jsoniter.output.CodegenAccess;
import com.jsoniter.output.JsonStream;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CodegenAccess_writeValTest_42_Test {
//failed_pass   @Test
//  public void writeValTest() throws Exception {
//    // Arrange
//    String cacheKey = "aaaaa";
//    long obj = 1L;
//    JsonStream jsonStream = (JsonStream) null;
//
//    // Act and Assert
//    thrown.expect(ClassCastException.class);
//    CodegenAccess.writeVal(cacheKey, obj, jsonStream);
//    Assert.assertEquals(null, jsonStream);
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
