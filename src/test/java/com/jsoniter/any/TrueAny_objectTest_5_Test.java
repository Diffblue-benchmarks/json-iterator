package com.jsoniter.any;

import com.jsoniter.any.TrueAny;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TrueAny_objectTest_5_Test {
//failed_pass   @Test
//  public void objectTest() throws Exception {
//    // Arrange
//    TrueAny trueAny = new TrueAny();
//
//    // Act
//    Object actual = trueAny.object();
//
//    // Assert
//    Assert.assertTrue(actual instanceof Boolean);
//    Assert.assertEquals(Boolean.valueOf(true), actual);
//    float toFloatResult = trueAny.toFloat();
//    long toLongResult = trueAny.toLong();
//    String toStringResult = trueAny.toString();
//    int toIntResult = trueAny.toInt();
//    BigDecimal toBigDecimalResult = trueAny.toBigDecimal();
//    BigInteger toBigIntegerResult = trueAny.toBigInteger();
//    boolean toBooleanResult = trueAny.toBoolean();
//    double toDoubleResult = trueAny.toDouble();
//    Assert.assertEquals(1.0f, toFloatResult);
//    Assert.assertEquals(0, trueAny.size());
//    Assert.assertEquals(1.0, toDoubleResult);
//    Assert.assertTrue(toBooleanResult);
//    BigInteger negateResult = toBigIntegerResult.negate();
//    String toStringResult1 = toBigIntegerResult.toString();
//    BigInteger absResult = toBigIntegerResult.abs();
//    int lowestSetBit = toBigIntegerResult.getLowestSetBit();
//    int signumResult = toBigIntegerResult.signum();
//    int scaleResult = toBigDecimalResult.scale();
//    String toStringResult2 = toBigDecimalResult.toString();
//    BigDecimal plusResult = toBigDecimalResult.plus();
//    BigDecimal absResult1 = toBigDecimalResult.abs();
//    int signumResult1 = toBigDecimalResult.signum();
//    Assert.assertEquals(1L, toLongResult);
//    Assert.assertEquals(1, toIntResult);
//    Assert.assertEquals("true", toStringResult);
//    Assert.assertSame(toBigDecimalResult, plusResult);
//    Assert.assertEquals("1", toStringResult2);
//    Assert.assertEquals(0, scaleResult);
//    Assert.assertEquals(0, lowestSetBit);
//    Assert.assertSame(toBigIntegerResult, absResult);
//    Assert.assertEquals("1", toStringResult1);
//    BigInteger negateResult1 = negateResult.negate();
//    String toStringResult3 = negateResult.toString();
//    BigInteger absResult2 = negateResult.abs();
//    int lowestSetBit1 = negateResult.getLowestSetBit();
//    int signumResult2 = negateResult.signum();
//    Assert.assertEquals(1, signumResult);
//    Assert.assertEquals(1, signumResult1);
//    Assert.assertSame(toBigDecimalResult, absResult1);
//    BigInteger negateResult2 = absResult2.negate();
//    String toStringResult4 = absResult2.toString();
//    BigInteger absResult3 = absResult2.abs();
//    int lowestSetBit2 = absResult2.getLowestSetBit();
//    int signumResult3 = absResult2.signum();
//    Assert.assertEquals("-1", toStringResult3);
//    Assert.assertEquals(-1, signumResult2);
//    BigInteger negateResult3 = negateResult1.negate();
//    String toStringResult5 = negateResult1.toString();
//    BigInteger absResult4 = negateResult1.abs();
//    int lowestSetBit3 = negateResult1.getLowestSetBit();
//    Assert.assertEquals(0, lowestSetBit1);
//    Assert.assertEquals(1, negateResult1.signum());
//    Assert.assertEquals(0, lowestSetBit3);
//    Assert.assertSame(negateResult1, absResult4);
//    Assert.assertEquals("1", toStringResult5);
//    String toStringResult6 = negateResult3.toString();
//    int lowestSetBit4 = negateResult3.getLowestSetBit();
//    int signumResult4 = negateResult3.signum();
//    Assert.assertEquals("1", toStringResult4);
//    Assert.assertEquals(0, lowestSetBit2);
//    Assert.assertEquals(1, signumResult3);
//    String toStringResult7 = negateResult2.toString();
//    BigInteger absResult5 = negateResult2.abs();
//    int lowestSetBit5 = negateResult2.getLowestSetBit();
//    Assert.assertSame(absResult2, absResult3);
//    Assert.assertEquals(-1, negateResult2.signum());
//    Assert.assertEquals(0, lowestSetBit5);
//    String toStringResult8 = absResult5.toString();
//    Assert.assertEquals("-1", toStringResult7);
//    Assert.assertEquals(-1, signumResult4);
//    Assert.assertEquals(0, lowestSetBit4);
//    Assert.assertEquals("-1", toStringResult6);
//    Assert.assertSame(absResult5, absResult5.abs());
//    Assert.assertEquals("1", toStringResult8);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
