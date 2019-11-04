package com.jsoniter.any;

import com.jsoniter.any.Any;
import com.jsoniter.any.ObjectAny;
import java.math.BigInteger;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class ObjectAny_toBigIntegerTest_13_Test {
//failed_run   @Test
//  public void toBigIntegerTest() throws Exception {
//    // Arrange
//    HashMap<String, Any> hashMap = new HashMap<String, Any>();
//    hashMap.put("aaaaa", Whitebox.newInstance(Any.class));
//    ObjectAny objectAny = new ObjectAny(hashMap);
//
//    // Act
//    BigInteger actual = objectAny.toBigInteger();
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
//    Assert.assertEquals(0, signumResult);
//    Assert.assertEquals("0", toStringResult);
//    Assert.assertEquals(-1, lowestSetBit);
//    Assert.assertSame(actual, absResult);
//    Assert.assertEquals("0", toStringResult1);
//    BigInteger negateResult2 = negateResult1.negate();
//    String toStringResult2 = negateResult1.toString();
//    BigInteger absResult2 = negateResult1.abs();
//    int lowestSetBit2 = negateResult1.getLowestSetBit();
//    int signumResult2 = negateResult1.signum();
//    Assert.assertEquals(0, signumResult1);
//    Assert.assertEquals(-1, lowestSetBit1);
//    Assert.assertSame(negateResult, absResult1);
//    Assert.assertSame(negateResult1, absResult2);
//    Assert.assertEquals("0", toStringResult2);
//    BigInteger negateResult3 = negateResult2.negate();
//    String toStringResult3 = negateResult2.toString();
//    BigInteger absResult3 = negateResult2.abs();
//    int lowestSetBit3 = negateResult2.getLowestSetBit();
//    int signumResult3 = negateResult2.signum();
//    Assert.assertEquals(-1, lowestSetBit2);
//    Assert.assertEquals(0, signumResult2);
//    Assert.assertEquals(-1, lowestSetBit3);
//    Assert.assertSame(negateResult2, absResult3);
//    Assert.assertEquals("0", toStringResult3);
//    BigInteger negateResult4 = negateResult3.negate();
//    String toStringResult4 = negateResult3.toString();
//    BigInteger absResult4 = negateResult3.abs();
//    int lowestSetBit4 = negateResult3.getLowestSetBit();
//    Assert.assertEquals(0, signumResult3);
//    Assert.assertEquals(0, negateResult3.signum());
//    Assert.assertEquals(-1, lowestSetBit4);
//    Assert.assertSame(negateResult3, absResult4);
//    Assert.assertEquals("0", toStringResult4);
//    BigInteger negateResult5 = negateResult4.negate();
//    String toStringResult5 = negateResult4.toString();
//    BigInteger absResult5 = negateResult4.abs();
//    int lowestSetBit5 = negateResult4.getLowestSetBit();
//    int signumResult4 = negateResult4.signum();
//    BigInteger negateResult6 = negateResult5.negate();
//    String toStringResult6 = negateResult5.toString();
//    BigInteger absResult6 = negateResult5.abs();
//    int lowestSetBit6 = negateResult5.getLowestSetBit();
//    int signumResult5 = negateResult5.signum();
//    Assert.assertEquals(0, signumResult4);
//    Assert.assertEquals("0", toStringResult5);
//    Assert.assertEquals(-1, lowestSetBit5);
//    Assert.assertSame(negateResult4, absResult5);
//    Assert.assertEquals("0", toStringResult6);
//    BigInteger negateResult7 = negateResult6.negate();
//    String toStringResult7 = negateResult6.toString();
//    BigInteger absResult7 = negateResult6.abs();
//    int lowestSetBit7 = negateResult6.getLowestSetBit();
//    int signumResult6 = negateResult6.signum();
//    Assert.assertEquals(0, signumResult5);
//    Assert.assertEquals(-1, lowestSetBit6);
//    Assert.assertSame(negateResult5, absResult6);
//    Assert.assertSame(negateResult6, absResult7);
//    Assert.assertEquals("0", toStringResult7);
//    String toStringResult8 = negateResult7.toString();
//    BigInteger absResult8 = negateResult7.abs();
//    int lowestSetBit8 = negateResult7.getLowestSetBit();
//    Assert.assertEquals(-1, lowestSetBit7);
//    Assert.assertEquals(0, signumResult6);
//    Assert.assertEquals(-1, lowestSetBit8);
//    Assert.assertSame(negateResult7, absResult8);
//    Assert.assertEquals("0", toStringResult8);
//    Assert.assertEquals(0, negateResult7.signum());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
