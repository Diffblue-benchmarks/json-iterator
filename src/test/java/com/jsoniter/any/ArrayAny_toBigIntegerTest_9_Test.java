package com.jsoniter.any;

import com.jsoniter.any.Any;
import com.jsoniter.any.ArrayAny;
import java.math.BigInteger;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class ArrayAny_toBigIntegerTest_9_Test {
//failed_run   @Test
//  public void toBigIntegerTest() throws Exception {
//    // Arrange
//    ArrayList<Any> arrayList = new ArrayList<Any>();
//    arrayList.add(Whitebox.newInstance(Any.class));
//    ArrayAny arrayAny = new ArrayAny(arrayList);
//
//    // Act
//    BigInteger actual = arrayAny.toBigInteger();
//
//    // Assert
//    BigInteger negateResult = actual.negate();
//    String toStringResult = actual.toString();
//    BigInteger absResult = actual.abs();
//    int lowestSetBit = actual.getLowestSetBit();
//    int signumResult = actual.signum();
//    BigInteger negateResult1 = negateResult.negate();
//    String toStringResult1 = negateResult.toString();
//    BigInteger absResult1 = negateResult.abs();
//    int lowestSetBit1 = negateResult.getLowestSetBit();
//    int signumResult1 = negateResult.signum();
//    Assert.assertEquals(1, signumResult);
//    Assert.assertEquals("1", toStringResult);
//    Assert.assertEquals(0, lowestSetBit);
//    Assert.assertSame(actual, absResult);
//    Assert.assertEquals("-1", toStringResult1);
//    BigInteger negateResult2 = negateResult1.negate();
//    String toStringResult2 = negateResult1.toString();
//    BigInteger absResult2 = negateResult1.abs();
//    int lowestSetBit2 = negateResult1.getLowestSetBit();
//    int signumResult2 = negateResult1.signum();
//    Assert.assertEquals(-1, signumResult1);
//    Assert.assertEquals(0, lowestSetBit1);
//    BigInteger negateResult3 = absResult1.negate();
//    String toStringResult3 = absResult1.toString();
//    BigInteger absResult3 = absResult1.abs();
//    int lowestSetBit3 = absResult1.getLowestSetBit();
//    Assert.assertSame(negateResult1, absResult2);
//    Assert.assertEquals(1, absResult1.signum());
//    Assert.assertEquals(0, lowestSetBit3);
//    Assert.assertSame(absResult1, absResult3);
//    Assert.assertEquals("1", toStringResult3);
//    BigInteger negateResult4 = negateResult3.negate();
//    String toStringResult4 = negateResult3.toString();
//    BigInteger absResult4 = negateResult3.abs();
//    int lowestSetBit4 = negateResult3.getLowestSetBit();
//    int signumResult3 = negateResult3.signum();
//    Assert.assertEquals("1", toStringResult2);
//    Assert.assertEquals(1, signumResult2);
//    BigInteger negateResult5 = negateResult2.negate();
//    String toStringResult5 = negateResult2.toString();
//    BigInteger absResult5 = negateResult2.abs();
//    int lowestSetBit5 = negateResult2.getLowestSetBit();
//    Assert.assertEquals(0, lowestSetBit2);
//    Assert.assertEquals(-1, negateResult2.signum());
//    Assert.assertEquals(0, lowestSetBit5);
//    String toStringResult6 = absResult5.toString();
//    BigInteger absResult6 = absResult5.abs();
//    int lowestSetBit6 = absResult5.getLowestSetBit();
//    int signumResult4 = absResult5.signum();
//    Assert.assertEquals("-1", toStringResult5);
//    Assert.assertEquals(0, lowestSetBit4);
//    Assert.assertEquals(-1, signumResult3);
//    String toStringResult7 = negateResult4.toString();
//    BigInteger absResult7 = negateResult4.abs();
//    int lowestSetBit7 = negateResult4.getLowestSetBit();
//    int signumResult5 = negateResult4.signum();
//    String toStringResult8 = absResult4.toString();
//    BigInteger absResult8 = absResult4.abs();
//    int lowestSetBit8 = absResult4.getLowestSetBit();
//    int signumResult6 = absResult4.signum();
//    Assert.assertEquals("-1", toStringResult4);
//    String toStringResult9 = negateResult5.toString();
//    BigInteger absResult9 = negateResult5.abs();
//    int lowestSetBit9 = negateResult5.getLowestSetBit();
//    Assert.assertEquals(0, lowestSetBit8);
//    Assert.assertEquals(1, negateResult5.signum());
//    Assert.assertEquals(0, lowestSetBit9);
//    Assert.assertSame(negateResult5, absResult9);
//    Assert.assertEquals("1", toStringResult9);
//    Assert.assertSame(absResult4, absResult8);
//    Assert.assertEquals("1", toStringResult8);
//    Assert.assertEquals(0, lowestSetBit7);
//    Assert.assertSame(negateResult4, absResult7);
//    Assert.assertEquals("1", toStringResult7);
//    Assert.assertEquals(1, signumResult5);
//    Assert.assertEquals("1", toStringResult6);
//    Assert.assertEquals(0, lowestSetBit6);
//    Assert.assertEquals(1, signumResult4);
//    Assert.assertEquals(1, signumResult6);
//    Assert.assertSame(absResult5, absResult6);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
