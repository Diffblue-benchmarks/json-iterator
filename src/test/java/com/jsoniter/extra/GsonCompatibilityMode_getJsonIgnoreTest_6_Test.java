//package com.jsoniter.extra;
//
//import com.jsoniter.annotation.JsonIgnore;
//import com.jsoniter.extra.GsonCompatibilityMode;
//import com.oracle.xmlns.internal.webservices.jaxws_databinding.XmlAction;
//import java.lang.annotation.Annotation;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.rules.Timeout;
//import org.powermock.reflect.Whitebox;
//
//public class GsonCompatibilityMode_getJsonIgnoreTest_6_Test {
//  @Test
//  public void getJsonIgnoreTest() throws Exception {
//    // Arrange
//    GsonCompatibilityMode gsonCompatibilityMode = Whitebox.newInstance(GsonCompatibilityMode.class);
//    XmlAction xmlAction = new XmlAction();
//    XmlAction xmlAction1 = new XmlAction();
//    XmlAction xmlAction2 = new XmlAction();
//    Annotation[] annotationArray = new Annotation[]{xmlAction, xmlAction1, xmlAction2};
//
//    // Act
//    JsonIgnore actual = gsonCompatibilityMode.getJsonIgnore(annotationArray);
//
//    // Assert
//    Assert.assertEquals(null, actual);
//    Assert.assertEquals(3, annotationArray.length);
//    Annotation annotation = annotationArray[0];
//    Annotation annotation1 = annotationArray[1];
//    Annotation annotation2 = annotationArray[2];
//    Assert.assertSame(xmlAction, annotation);
//    Assert.assertTrue(annotation instanceof XmlAction);
//    Assert.assertSame(xmlAction2, annotation2);
//    Assert.assertTrue(annotation2 instanceof XmlAction);
//    Assert.assertSame(xmlAction, annotation);
//    Assert.assertSame(xmlAction2, annotation2);
//    Assert.assertSame(xmlAction1, annotation1);
//    Assert.assertTrue(annotation1 instanceof XmlAction);
//    Assert.assertSame(xmlAction1, annotation1);
//  }
//  @org.junit.Rule
//  public Timeout timeout = new Timeout(10000);
//}
//