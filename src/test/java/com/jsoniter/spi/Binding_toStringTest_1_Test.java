package com.jsoniter.spi;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.spi.Binding;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class Binding_toStringTest_1_Test {
  @Test
  public void toStringTest() throws Exception {
    // Arrange
    HashMap<String, Type> hashMap = new HashMap<String, Type>();
    hashMap.put("aaaaa", null);
    Binding binding = Whitebox.newInstance(Binding.class);

    // Act
    String actual = binding.toString();

    // Assert
    Assert.assertNotNull(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
