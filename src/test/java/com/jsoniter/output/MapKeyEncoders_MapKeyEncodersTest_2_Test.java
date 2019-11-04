package com.jsoniter.output;

import com.jsoniter.output.MapKeyEncoders;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MapKeyEncoders_MapKeyEncodersTest_2_Test {
  @Test
  public void MapKeyEncodersTest() throws Exception {
    // Arrange and Act
    MapKeyEncoders mapKeyEncoders = new MapKeyEncoders();

    // Assert
    Assert.assertNotNull(mapKeyEncoders.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
