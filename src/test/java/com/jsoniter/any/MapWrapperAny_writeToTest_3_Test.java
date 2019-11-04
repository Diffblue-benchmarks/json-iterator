package com.jsoniter.any;

import com.jsoniter.any.MapWrapperAny;
import com.jsoniter.output.JsonStream;
import com.jsoniter.spi.Config;
import com.jsoniter.spi.Slice;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MapWrapperAny_writeToTest_3_Test {
//failed_compile   @Test
//  public void writeToTest() throws Exception {
//    // Arrange
//    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
//    hashMap.put("aaaaa", "aaaaa");
//    MapWrapperAny mapWrapperAny = new MapWrapperAny(hashMap);
//    JsonStream jsonStream = new JsonStream(new ByteArrayOutputStream(), 2561);
//    jsonStream.configCache = (Config) null;
//
//    // Act
//    mapWrapperAny.writeTo(jsonStream);
//
//    // Assert
//    String toStringResult = jsonStream.toString();
//    Slice bufferResult = jsonStream.buffer();
//    Config config = jsonStream.configCache;
//    Assert.assertNotNull(toStringResult);
//    String toStringResult1 = config.toString();
//    Config.Builder builderResult = config.builder();
//    String toStringResult2 = bufferResult.toString();
//    int lenResult = bufferResult.len();
//    int tailResult = bufferResult.tail();
//    byte[] dataResult = bufferResult.data();
//    Assert.assertEquals(2561, dataResult.length);
//    Assert.assertEquals((byte) 123, dataResult[0]);
//    Assert.assertEquals((byte) 34, dataResult[1]);
//    Assert.assertEquals((byte) 0, dataResult[2559]);
//    Assert.assertEquals((byte) 0, dataResult[2560]);
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertEquals(17, tailResult);
//    Assert.assertEquals(17, lenResult);
//    Assert.assertEquals("{\"aaaaa\":\"aaaaa\"}", toStringResult2);
//    Assert.assertEquals(
//        "Config{decodingMode=REFLECTION_MODE, encodingMode=DYNAMIC_MODE, indentionStep=0, escapeUnicode=true, omitDefaultValue=false}",
//        builderResult.toString());
//    float toFloatResult = mapWrapperAny.toFloat();
//    long toLongResult = mapWrapperAny.toLong();
//    int toIntResult = mapWrapperAny.toInt();
//    boolean toBooleanResult = mapWrapperAny.toBoolean();
//    double toDoubleResult = mapWrapperAny.toDouble();
//    Assert.assertEquals(1.0f, toFloatResult);
//    Assert.assertEquals(1, mapWrapperAny.size());
//    Assert.assertEquals(1.0, toDoubleResult);
//    Assert.assertTrue(toBooleanResult);
//    Assert.assertEquals(1, toIntResult);
//    Assert.assertEquals(1L, toLongResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
