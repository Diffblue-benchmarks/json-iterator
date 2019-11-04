package com.jsoniter.spi;

import com.jsoniter.spi.JsonException;
import com.jsoniter.spi.TypeLiteral;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TypeLiteral_TypeLiteralTest_6_Test {
  @Test
  public void TypeLiteralTest() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(JsonException.class);
    new TypeLiteral<Object>();
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
