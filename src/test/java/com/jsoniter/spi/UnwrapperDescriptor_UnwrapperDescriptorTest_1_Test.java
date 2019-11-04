package com.jsoniter.spi;

import com.jsoniter.spi.UnwrapperDescriptor;
import java.lang.reflect.Method;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class UnwrapperDescriptor_UnwrapperDescriptorTest_1_Test {
  @Test
  public void UnwrapperDescriptorTest() throws Exception {
    // Arrange
    Method method = (Method) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    new UnwrapperDescriptor(method);
    Assert.assertEquals(null, method);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
