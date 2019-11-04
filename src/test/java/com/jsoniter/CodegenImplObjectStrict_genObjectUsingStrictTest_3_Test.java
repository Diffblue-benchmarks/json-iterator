package com.jsoniter;

import com.jsoniter.CodegenImplObjectStrict;
import com.jsoniter.spi.ClassDescriptor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CodegenImplObjectStrict_genObjectUsingStrictTest_3_Test {
  @Test
  public void genObjectUsingStrictTest() throws Exception {
    // Arrange
    ClassDescriptor classDescriptor = (ClassDescriptor) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    CodegenImplObjectStrict.genObjectUsingStrict(classDescriptor);
    Assert.assertEquals(null, classDescriptor);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
