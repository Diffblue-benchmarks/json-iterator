package com.jsoniter.fuzzy;

import com.fasterxml.jackson.databind.type.ArrayType;
import com.jsoniter.fuzzy.MaybeEmptyArrayDecoder;
import com.jsoniter.spi.Binding;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MaybeEmptyArrayDecoder_MaybeEmptyArrayDecoderTest_2_Test {
  @Test
  public void MaybeEmptyArrayDecoderTest() throws Exception {
    // Arrange
    HashMap<String, Type> hashMap = new HashMap<String, Type>();
    hashMap.put("aaaaa", null);
    Binding binding = (Binding) null;

    // Act
    MaybeEmptyArrayDecoder maybeEmptyArrayDecoder = new MaybeEmptyArrayDecoder(binding);

    // Assert
    Assert.assertNotNull(maybeEmptyArrayDecoder.toString());
    Assert.assertEquals(null, binding);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
