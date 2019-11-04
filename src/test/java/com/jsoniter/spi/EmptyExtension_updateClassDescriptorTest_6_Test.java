package com.jsoniter.spi;

import com.jsoniter.spi.ClassDescriptor;
import com.jsoniter.spi.EmptyExtension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EmptyExtension_updateClassDescriptorTest_6_Test {
  @Test
  public void updateClassDescriptorTest() throws Exception {
    // Arrange
    EmptyExtension emptyExtension = new EmptyExtension();
    ClassDescriptor classDescriptor = (ClassDescriptor) null;

    // Act
    emptyExtension.updateClassDescriptor(classDescriptor);

    // Assert
    Assert.assertEquals(null, classDescriptor);
    Assert.assertNotNull(emptyExtension.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
