package com.jsoniter.any;

import com.jsoniter.any.NullAny;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class NullAny_toBigDecimalTest_7_Test {
//failed_pass   @Test
//  public void toBigDecimalTest() throws Exception {
//    // Arrange
//    NullAny nullAny = new NullAny();
//
//    // Act
//    BigDecimal actual = nullAny.toBigDecimal();
//
//    // Assert
//    int scaleResult = actual.scale();
//    String toStringResult = actual.toString();
//    BigDecimal plusResult = actual.plus();
//    BigDecimal absResult = actual.abs();
//    Assert.assertEquals(0, scaleResult);
//    Assert.assertEquals(0, actual.signum());
//    Assert.assertSame(actual, absResult);
//    Assert.assertSame(actual, plusResult);
//    Assert.assertEquals("0", toStringResult);
//    float toFloatResult = nullAny.toFloat();
//    long toLongResult = nullAny.toLong();
//    String toStringResult1 = nullAny.toString();
//    int toIntResult = nullAny.toInt();
//    BigDecimal toBigDecimalResult = nullAny.toBigDecimal();
//    BigInteger toBigIntegerResult = nullAny.toBigInteger();
//    boolean toBooleanResult = nullAny.toBoolean();
//    double toDoubleResult = nullAny.toDouble();
//    Assert.assertEquals(0.0f, toFloatResult);
//    Assert.assertEquals(0, nullAny.size());
//    Assert.assertEquals(0.0, toDoubleResult);
//    Assert.assertFalse(toBooleanResult);
//    BigInteger negateResult = toBigIntegerResult.negate();
//    String toStringResult2 = toBigIntegerResult.toString();
//    BigInteger absResult1 = toBigIntegerResult.abs();
//    int lowestSetBit = toBigIntegerResult.getLowestSetBit();
//    int signumResult = toBigIntegerResult.signum();
//    Assert.assertSame(actual, toBigDecimalResult);
//    Assert.assertEquals(0L, toLongResult);
//    Assert.assertEquals(0, toIntResult);
//    Assert.assertEquals("null", toStringResult1);
//    Assert.assertEquals("0", toStringResult2);
//    BigInteger negateResult1 = negateResult.negate();
//    String toStringResult3 = negateResult.toString();
//    BigInteger absResult2 = negateResult.abs();
//    int lowestSetBit1 = negateResult.getLowestSetBit();
//    int signumResult1 = negateResult.signum();
//    Assert.assertEquals(0, signumResult);
//    Assert.assertEquals(-1, lowestSetBit);
//    Assert.assertSame(toBigIntegerResult, absResult1);
//    Assert.assertSame(negateResult, absResult2);
//    Assert.assertEquals("0", toStringResult3);
//    BigInteger negateResult2 = negateResult1.negate();
//    String toStringResult4 = negateResult1.toString();
//    BigInteger absResult3 = negateResult1.abs();
//    int lowestSetBit2 = negateResult1.getLowestSetBit();
//    int signumResult2 = negateResult1.signum();
//    Assert.assertEquals(-1, lowestSetBit1);
//    Assert.assertEquals(0, signumResult1);
//    Assert.assertEquals(-1, lowestSetBit2);
//    Assert.assertSame(negateResult1, absResult3);
//    Assert.assertEquals("0", toStringResult4);
//    BigInteger negateResult3 = negateResult2.negate();
//    String toStringResult5 = negateResult2.toString();
//    BigInteger absResult4 = negateResult2.abs();
//    int lowestSetBit3 = negateResult2.getLowestSetBit();
//    Assert.assertEquals(0, signumResult2);
//    Assert.assertEquals(0, negateResult2.signum());
//    Assert.assertEquals(-1, lowestSetBit3);
//    Assert.assertSame(negateResult2, absResult4);
//    Assert.assertEquals("0", toStringResult5);
//    BigInteger negateResult4 = negateResult3.negate();
//    String toStringResult6 = negateResult3.toString();
//    BigInteger absResult5 = negateResult3.abs();
//    int lowestSetBit4 = negateResult3.getLowestSetBit();
//    int signumResult3 = negateResult3.signum();
//    BigInteger negateResult5 = negateResult4.negate();
//    String toStringResult7 = negateResult4.toString();
//    BigInteger absResult6 = negateResult4.abs();
//    int lowestSetBit5 = negateResult4.getLowestSetBit();
//    int signumResult4 = negateResult4.signum();
//    Assert.assertEquals(0, signumResult3);
//    Assert.assertEquals("0", toStringResult6);
//    Assert.assertEquals(-1, lowestSetBit4);
//    Assert.assertSame(negateResult3, absResult5);
//    Assert.assertEquals("0", toStringResult7);
//    String toStringResult8 = negateResult5.toString();
//    Assert.assertEquals(0, signumResult4);
//    Assert.assertEquals(-1, lowestSetBit5);
//    Assert.assertSame(negateResult4, absResult6);
//    Assert.assertEquals("0", toStringResult8);
//    Assert.assertSame(negateResult5, negateResult5.abs());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}