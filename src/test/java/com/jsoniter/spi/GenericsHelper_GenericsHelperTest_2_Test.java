package com.jsoniter.spi;

import com.jsoniter.spi.GenericsHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class GenericsHelper_GenericsHelperTest_2_Test {
  @Test
  public void GenericsHelperTest() throws Exception {
    // Arrange and Act
    GenericsHelper genericsHelper = new GenericsHelper();

    // Assert
    Assert.assertNotNull(genericsHelper.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
