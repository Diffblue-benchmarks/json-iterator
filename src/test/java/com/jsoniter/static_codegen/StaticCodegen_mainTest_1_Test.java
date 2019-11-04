package com.jsoniter.static_codegen;

import com.jsoniter.static_codegen.StaticCodegen;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class StaticCodegen_mainTest_1_Test {
  @Test
  public void mainTest() throws Exception {
    // Arrange
    String[] stringArray = new String[]{"aaaaa", "aaaaa", "aaaaa"};

    // Act and Assert
    thrown.expect(ClassNotFoundException.class);
    StaticCodegen.main(stringArray);
    Assert.assertEquals(3, stringArray.length);
    Assert.assertArrayEquals(new String[]{"aaaaa", "aaaaa", "aaaaa"}, stringArray);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
