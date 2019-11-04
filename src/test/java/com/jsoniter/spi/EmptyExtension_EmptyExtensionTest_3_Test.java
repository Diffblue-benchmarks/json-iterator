package com.jsoniter.spi;

import com.jsoniter.spi.EmptyExtension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EmptyExtension_EmptyExtensionTest_3_Test {
  @Test
  public void EmptyExtensionTest() throws Exception {
    // Arrange and Act
    EmptyExtension emptyExtension = new EmptyExtension();

    // Assert
    Assert.assertNotNull(emptyExtension.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
