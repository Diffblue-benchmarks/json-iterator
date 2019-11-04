package com.jsoniter.any;

import com.jsoniter.any.DoubleAny;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DoubleAny_toBigDecimalTest_4_Test {
//failed_pass   @Test
//  public void toBigDecimalTest() throws Exception {
//    // Arrange
//    DoubleAny doubleAny = new DoubleAny(1.0);
//
//    // Act
//    BigDecimal actual = doubleAny.toBigDecimal();
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
//    float toFloatResult = doubleAny.toFloat();
//    long toLongResult = doubleAny.toLong();
//    String toStringResult1 = doubleAny.toString();
//    int toIntResult = doubleAny.toInt();
//    boolean toBooleanResult = doubleAny.toBoolean();
//    double toDoubleResult = doubleAny.toDouble();
//    Assert.assertEquals(1.0f, toFloatResult);
//    Assert.assertEquals(0, doubleAny.size());
//    Assert.assertEquals(1.0, toDoubleResult);
//    Assert.assertTrue(toBooleanResult);
//    Assert.assertEquals(1, toIntResult);
//    Assert.assertEquals("1.0", toStringResult1);
//    Assert.assertEquals(1L, toLongResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
