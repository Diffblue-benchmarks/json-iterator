package com.jsoniter.output;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.any.Any;
import com.jsoniter.output.ReflectionMapEncoder;
import java.lang.reflect.Type;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ReflectionMapEncoder_wrapTest_1_Test {
  @Test
  public void wrapTest() throws Exception {
    // Arrange
    ReflectionMapEncoder reflectionMapEncoder = new ReflectionMapEncoder(null, new Type[]{null, null, null});
    String obj = "aaaaa";

    // Act and Assert
    thrown.expect(ClassCastException.class);
    reflectionMapEncoder.wrap(obj);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
