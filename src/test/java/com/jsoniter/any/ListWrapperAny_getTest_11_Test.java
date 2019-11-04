package com.jsoniter.any;

import com.jsoniter.any.Any;
import com.jsoniter.any.ListWrapperAny;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ListWrapperAny_getTest_11_Test {
//failed_pass   @Test
//  public void getTest() throws Exception {
//    // Arrange
//    ArrayList<Object> arrayList = new ArrayList<Object>();
//    String string = "aaaaa";
//    arrayList.add(string);
//    ListWrapperAny listWrapperAny = new ListWrapperAny(arrayList);
//    Object[] objectArray = new Object[]{"aaaaa", string, "aakaa"};
//    int idx = 1;
//
//    // Act
//    Any actual = listWrapperAny.get(objectArray, idx);
//
//    // Assert
//    Assert.assertTrue(actual instanceof com.jsoniter.any.NotFoundAny);
//    float toFloatResult = actual.toFloat();
//    long toLongResult = actual.toLong();
//    String toStringResult = actual.toString();
//    int toIntResult = actual.toInt();
//    BigDecimal toBigDecimalResult = actual.toBigDecimal();
//    BigInteger toBigIntegerResult = actual.toBigInteger();
//    boolean toBooleanResult = actual.toBoolean();
//    double toDoubleResult = actual.toDouble();
//    Assert.assertEquals(0.0f, toFloatResult);
//    Assert.assertEquals(0, actual.size());
//    Assert.assertEquals(0.0, toDoubleResult);
//    Assert.assertFalse(toBooleanResult);
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
//    Assert.assertEquals(0L, toLongResult);
//    Assert.assertEquals(0, toIntResult);
//    Assert.assertEquals("", toStringResult);
//    Assert.assertSame(toBigDecimalResult, plusResult);
//    Assert.assertEquals("0", toStringResult2);
//    Assert.assertEquals(0, scaleResult);
//    Assert.assertEquals(-1, lowestSetBit);
//    Assert.assertSame(toBigIntegerResult, absResult);
//    Assert.assertEquals("0", toStringResult1);
//    BigInteger negateResult1 = negateResult.negate();
//    String toStringResult3 = negateResult.toString();
//    BigInteger absResult2 = negateResult.abs();
//    int lowestSetBit1 = negateResult.getLowestSetBit();
//    int signumResult2 = negateResult.signum();
//    Assert.assertEquals(0, signumResult);
//    Assert.assertEquals(0, signumResult1);
//    Assert.assertSame(toBigDecimalResult, absResult1);
//    Assert.assertSame(negateResult, absResult2);
//    Assert.assertEquals("0", toStringResult3);
//    BigInteger negateResult2 = negateResult1.negate();
//    String toStringResult4 = negateResult1.toString();
//    BigInteger absResult3 = negateResult1.abs();
//    int lowestSetBit2 = negateResult1.getLowestSetBit();
//    int signumResult3 = negateResult1.signum();
//    Assert.assertEquals(-1, lowestSetBit1);
//    Assert.assertEquals(0, signumResult2);
//    Assert.assertEquals(-1, lowestSetBit2);
//    Assert.assertSame(negateResult1, absResult3);
//    Assert.assertEquals("0", toStringResult4);
//    BigInteger negateResult3 = negateResult2.negate();
//    String toStringResult5 = negateResult2.toString();
//    BigInteger absResult4 = negateResult2.abs();
//    int lowestSetBit3 = negateResult2.getLowestSetBit();
//    Assert.assertEquals(0, signumResult3);
//    Assert.assertEquals(0, negateResult2.signum());
//    Assert.assertEquals(-1, lowestSetBit3);
//    Assert.assertSame(negateResult2, absResult4);
//    Assert.assertEquals("0", toStringResult5);
//    BigInteger negateResult4 = negateResult3.negate();
//    String toStringResult6 = negateResult3.toString();
//    BigInteger absResult5 = negateResult3.abs();
//    int lowestSetBit4 = negateResult3.getLowestSetBit();
//    int signumResult4 = negateResult3.signum();
//    BigInteger negateResult5 = negateResult4.negate();
//    String toStringResult7 = negateResult4.toString();
//    BigInteger absResult6 = negateResult4.abs();
//    int lowestSetBit5 = negateResult4.getLowestSetBit();
//    int signumResult5 = negateResult4.signum();
//    Assert.assertEquals(0, signumResult4);
//    Assert.assertEquals("0", toStringResult6);
//    Assert.assertEquals(-1, lowestSetBit4);
//    Assert.assertSame(negateResult3, absResult5);
//    Assert.assertEquals("0", toStringResult7);
//    String toStringResult8 = negateResult5.toString();
//    Assert.assertEquals(0, signumResult5);
//    Assert.assertEquals(-1, lowestSetBit5);
//    Assert.assertSame(negateResult4, absResult6);
//    Assert.assertEquals("0", toStringResult8);
//    Assert.assertSame(negateResult5, negateResult5.abs());
//    Assert.assertEquals(3, objectArray.length);
//    Object object = objectArray[0];
//    Object object1 = objectArray[1];
//    Object object2 = objectArray[2];
//    Assert.assertTrue(object instanceof String);
//    Assert.assertTrue(object2 instanceof String);
//    Assert.assertEquals("aaaaa", object);
//    Assert.assertEquals("aakaa", object2);
//    Assert.assertTrue(object1 instanceof String);
//    Assert.assertEquals("aaaaa", object1);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
