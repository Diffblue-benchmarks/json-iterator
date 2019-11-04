package com.jsoniter;

import com.jsoniter.IterImplString;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class IterImplString_translateHexTest_2_Test {
  @Test
  public void translateHexTest() throws Exception {
    // Arrange
    byte b = (byte) 0;

    // Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    IterImplString.translateHex(b);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
