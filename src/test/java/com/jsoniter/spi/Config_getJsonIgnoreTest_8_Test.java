//package com.jsoniter.spi;
//
//import com.jsoniter.annotation.JsonIgnore;
//import com.jsoniter.spi.Config;
//import com.oracle.xmlns.internal.webservices.jaxws_databinding.XmlAction;
//import java.lang.annotation.Annotation;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.rules.Timeout;
//
//public class Config_getJsonIgnoreTest_8_Test {
//  @Test
//  public void getJsonIgnoreTest() throws Exception {
//    // Arrange
//    Config.Builder builder = new Config.Builder();
//    Config config = new Config("aaaaa", builder);
//    XmlAction xmlAction = new XmlAction();
//    XmlAction xmlAction1 = new XmlAction();
//    XmlAction xmlAction2 = new XmlAction();
//    Annotation[] annotationArray = new Annotation[]{xmlAction, xmlAction1, xmlAction2};
//
//    // Act
//    JsonIgnore actual = config.getJsonIgnore(annotationArray);
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
//    Config.Builder builderResult = config.builder();
//    Assert.assertSame(builder, builderResult);
//    Assert.assertEquals(
//        "Config{decodingMode=REFLECTION_MODE, encodingMode=REFLECTION_MODE, indentionStep=0, escapeUnicode=true, omitDefaultValue=false}",
//        builderResult.toString());
//  }
//  @org.junit.Rule
//  public Timeout timeout = new Timeout(10000);
//}
//