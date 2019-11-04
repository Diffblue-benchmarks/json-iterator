package com.jsoniter;

import com.jsoniter.JsonIterator;
import com.jsoniter.spi.Config;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class JsonIterator_readArrayCBTest_19_Test {
  @Test
  public void readArrayCBTest() throws Exception {
    // Arrange
    JsonIterator jsonIterator = new JsonIterator();
    jsonIterator.configCache = (Config) null;
    JsonIterator.ReadArrayCallback callback = Whitebox.newInstance(JsonIterator.ReadArrayCallback.class);
    String attachment = "aaaaa";

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    jsonIterator.readArrayCB(callback, attachment);
    String toStringResult = jsonIterator.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, jsonIterator.configCache);
    Assert.assertEquals("", jsonIterator.readNumberAsString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
