package com.jsoniter.any;

import com.jsoniter.any.FloatAny;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FloatAny_toBigDecimalTest_11_Test {
//failed_pass   @Test
//  public void toBigDecimalTest() throws Exception {
//    // Arrange
//    FloatAny floatAny = new FloatAny(1.0f);
//
//    // Act
//    BigDecimal actual = floatAny.toBigDecimal();
//
//    // Assert
//    int scaleResult = actual.scale();
//    String toStringResult = actual.toString();
//    BigDecimal plusResult = actual.plus();
//    BigDecimal absResult = actual.abs();
//    Assert.assertEquals(1, scaleResult);
//    Assert.assertEquals(1, actual.signum());
//    Assert.assertSame(actual, absResult);
//    Assert.assertSame(actual, plusResult);
//    Assert.assertEquals("1.0", toStringResult);
//    float toFloatResult = floatAny.toFloat();
//    long toLongResult = floatAny.toLong();
//    String toStringResult1 = floatAny.toString();
//    int toIntResult = floatAny.toInt();
//    boolean toBooleanResult = floatAny.toBoolean();
//    double toDoubleResult = floatAny.toDouble();
//    Assert.assertEquals(1.0f, toFloatResult);
//    Assert.assertEquals(0, floatAny.size());
//    Assert.assertEquals(1.0, toDoubleResult);
//    Assert.assertTrue(toBooleanResult);
//    Assert.assertEquals(1, toIntResult);
//    Assert.assertEquals("1.0", toStringResult1);
//    Assert.assertEquals(1L, toLongResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
