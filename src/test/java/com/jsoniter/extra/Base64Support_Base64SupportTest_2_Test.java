package com.jsoniter.extra;

import com.jsoniter.extra.Base64Support;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Base64Support_Base64SupportTest_2_Test {
  @Test
  public void Base64SupportTest() throws Exception {
    // Arrange and Act
    Base64Support base64Support = new Base64Support();

    // Assert
    Assert.assertNotNull(base64Support.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
