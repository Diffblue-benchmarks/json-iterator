package com.jsoniter;

import com.jsoniter.MapKeyDecoders;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MapKeyDecoders_MapKeyDecodersTest_1_Test {
  @Test
  public void MapKeyDecodersTest() throws Exception {
    // Arrange and Act
    MapKeyDecoders mapKeyDecoders = new MapKeyDecoders();

    // Assert
    Assert.assertNotNull(mapKeyDecoders.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
