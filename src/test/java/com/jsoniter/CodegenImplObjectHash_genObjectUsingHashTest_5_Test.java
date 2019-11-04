package com.jsoniter;

import com.jsoniter.CodegenImplObjectHash;
import com.jsoniter.spi.ClassDescriptor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CodegenImplObjectHash_genObjectUsingHashTest_5_Test {
  @Test
  public void genObjectUsingHashTest() throws Exception {
    // Arrange
    ClassDescriptor classDescriptor = (ClassDescriptor) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    CodegenImplObjectHash.genObjectUsingHash(classDescriptor);
    Assert.assertEquals(null, classDescriptor);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
