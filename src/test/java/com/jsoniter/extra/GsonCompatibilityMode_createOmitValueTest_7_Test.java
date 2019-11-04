package com.jsoniter.extra;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.extra.GsonCompatibilityMode;
import com.jsoniter.spi.OmitValue;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class GsonCompatibilityMode_createOmitValueTest_7_Test {
//failed_pass   @Test
//  public void createOmitValueTest() throws Exception {
//    // Arrange
//    GsonCompatibilityMode gsonCompatibilityMode = Whitebox.newInstance(GsonCompatibilityMode.class);
//    ArrayType arrayType = (ArrayType) null;
//
//    // Act
//    OmitValue actual = gsonCompatibilityMode.createOmitValue(arrayType);
//
//    // Assert
//    Assert.assertEquals(null, actual);
//    Assert.assertEquals(null, arrayType);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
