package com.jsoniter.spi;

import com.jsoniter.spi.Binding;
import com.jsoniter.spi.WrapperDescriptor;
import java.lang.reflect.Method;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WrapperDescriptor_WrapperDescriptorTest_1_Test {
  @Test
  public void WrapperDescriptorTest() throws Exception {
    // Arrange and Act
    WrapperDescriptor wrapperDescriptor = new WrapperDescriptor();

    // Assert
    List<Binding> list = wrapperDescriptor.parameters;
    Assert.assertNotNull(wrapperDescriptor.toString());
    Assert.assertTrue(list instanceof java.util.ArrayList);
    Assert.assertEquals(null, wrapperDescriptor.method);
    Assert.assertEquals(0, list.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
