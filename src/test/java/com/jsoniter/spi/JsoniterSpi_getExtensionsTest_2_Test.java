package com.jsoniter.spi;

import com.jsoniter.spi.Config;
import com.jsoniter.spi.Extension;
import com.jsoniter.spi.JsoniterSpi;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JsoniterSpi_getExtensionsTest_2_Test {
  @Test
  public void getExtensionsTest() throws Exception {
    // Arrange and Act
    List<Extension> actual = JsoniterSpi.getExtensions();

    // Assert
    Assert.assertTrue(actual instanceof java.util.ArrayList);
    Assert.assertEquals(1, actual.size());
    Extension getResult = actual.get(0);
    Assert.assertTrue(getResult instanceof Config);
    String toStringResult = ((Config) getResult).toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(
        "Config{decodingMode=REFLECTION_MODE, encodingMode=REFLECTION_MODE, indentionStep=0, escapeUnicode=true, omitDefaultValue=false}",
        (((Config) getResult).builder()).toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
