//package com.jsoniter.spi;
//
//import com.jsoniter.spi.Config;
//import com.oracle.xmlns.internal.webservices.jaxws_databinding.XmlAction;
//import java.lang.annotation.Annotation;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//public class Config_getAnnotationTest_6_Test {
//  @Test
//  public void getAnnotationTest() throws Exception {
//    // Arrange
//    XmlAction xmlAction = new XmlAction();
//    XmlAction xmlAction1 = new XmlAction();
//    XmlAction xmlAction2 = new XmlAction();
//    Annotation[] annotationArray = new Annotation[]{xmlAction, xmlAction1, xmlAction2};
//    Class<Annotation> resultClass = (Class<Annotation>) null;
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    Config.<Annotation>getAnnotation(annotationArray, resultClass);
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
//    Assert.assertEquals(null, resultClass);
//  }
//  @Rule
//  public Timeout timeout = new Timeout(10000);
//  @Rule
//  public ExpectedException thrown = ExpectedException.none();
//}
//