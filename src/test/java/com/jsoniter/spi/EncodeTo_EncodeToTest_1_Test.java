package com.jsoniter.spi;

import com.jsoniter.spi.Binding;
import com.jsoniter.spi.EncodeTo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EncodeTo_EncodeToTest_1_Test {
  @Test
  public void EncodeToTest() throws Exception {
    // Arrange and Act
    EncodeTo encodeTo = new EncodeTo();

    // Assert
    Assert.assertEquals(null, encodeTo.binding);
    Assert.assertEquals(null, encodeTo.toName);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
