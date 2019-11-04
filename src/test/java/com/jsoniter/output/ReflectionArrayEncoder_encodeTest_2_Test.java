package com.jsoniter.output;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.output.JsonStream;
import com.jsoniter.output.ReflectionArrayEncoder;
import java.lang.reflect.Type;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class ReflectionArrayEncoder_encodeTest_2_Test {
//failed_run   @Test
//  public void encodeTest() throws Exception {
//    // Arrange
//    ReflectionArrayEncoder reflectionArrayEncoder = Whitebox.newInstance(ReflectionArrayEncoder.class);
//    String obj = "aaaaa";
//    JsonStream jsonStream = (JsonStream) null;
//
//    // Act
//    reflectionArrayEncoder.encode(obj, jsonStream);
//
//    // Assert
//    Assert.assertEquals(null, jsonStream);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
