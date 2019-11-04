package com.jsoniter.extra;

import com.jsoniter.extra.GsonCompatibilityMode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Builder_buildTest_36_Test {
//failed_pass   @Test
//  public void buildTest() throws Exception {
//    // Arrange
//    GsonCompatibilityMode.Builder builder = new GsonCompatibilityMode.Builder();
//
//    // Act and Assert
//    thrown.expect(UnsupportedOperationException.class);
//    builder.build();
//    Assert.assertNotNull(builder.toString());
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
