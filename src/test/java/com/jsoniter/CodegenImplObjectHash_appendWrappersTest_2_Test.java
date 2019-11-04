package com.jsoniter;

import com.jsoniter.CodegenImplObjectHash;
import com.jsoniter.spi.Binding;
import com.jsoniter.spi.WrapperDescriptor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CodegenImplObjectHash_appendWrappersTest_2_Test {
//failed_compile   @Test
//  public void appendWrappersTest() throws Exception {
//    // Arrange
//    ArrayList<WrapperDescriptor> arrayList = new ArrayList<WrapperDescriptor>();
//    WrapperDescriptor wrapperDescriptor = new WrapperDescriptor();
//    wrapperDescriptor.method = (Method) null;
//    ArrayList<Binding> arrayList1 = new ArrayList<Binding>();
//    arrayList1.add(null);
//    wrapperDescriptor.parameters = arrayList1;
//    arrayList.add(wrapperDescriptor);
//    StringBuilder stringBuilder = new StringBuilder();
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    CodegenImplObjectHash.appendWrappers(arrayList, stringBuilder);
//    Assert.assertEquals(1, arrayList.size());
//    WrapperDescriptor getResult = arrayList.get(0);
//    Assert.assertSame(wrapperDescriptor, getResult);
//    List<Binding> list = getResult.parameters;
//    Assert.assertNotNull(getResult.toString());
//    Assert.assertSame(arrayList1, list);
//    Assert.assertTrue(list instanceof ArrayList);
//    Assert.assertEquals(null, getResult.method);
//    Assert.assertSame(arrayList1, list);
//    char[] value = stringBuilder.getValue();
//    int capacityResult = stringBuilder.capacity();
//    String toStringResult = stringBuilder.toString();
//    Assert.assertEquals(16, value.length);
//    Assert.assertEquals('o', value[0]);
//    Assert.assertEquals('b', value[1]);
//    Assert.assertEquals('j', value[2]);
//    Assert.assertEquals('\u0000', value[13]);
//    Assert.assertEquals('\u0000', value[14]);
//    Assert.assertEquals('\u0000', value[15]);
//    Assert.assertEquals(4, stringBuilder.length());
//    Assert.assertEquals("obj.", toStringResult);
//    Assert.assertEquals(16, capacityResult);
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
