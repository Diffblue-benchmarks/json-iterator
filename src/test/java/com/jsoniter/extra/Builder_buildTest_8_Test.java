package com.jsoniter.extra;

import com.jsoniter.extra.JacksonCompatibilityMode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Builder_buildTest_8_Test {
//failed_pass   @Test
//  public void buildTest() throws Exception {
//    // Arrange
//    JacksonCompatibilityMode.Builder builder = new JacksonCompatibilityMode.Builder();
//
//    // Act and Assert
//    thrown.expect(UnsupportedOperationException.class);
//    builder.build();
//    Assert.assertEquals(
//        "Config{decodingMode=REFLECTION_MODE, encodingMode=REFLECTION_MODE, indentionStep=0, escapeUnicode=true, omitDefaultValue=false} => JacksonCompatibilityMode{}",
//        builder.toString());
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
