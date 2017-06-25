package com.marcarndt.morse.swarm;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by arndt on 2017/05/28.
 */
public class SwarmMorseBotConfigTest {

  /**
   * Test pojo.
   */
  @Test
  public void testPojo() {
    final SwarmMorseBotConfig morseBotConfig = new SwarmMorseBotConfig();
    morseBotConfig.botUserName = "test";
    Assert.assertEquals("test", morseBotConfig.getUsername());
    morseBotConfig.botKey = "key";
    Assert.assertEquals("key", morseBotConfig.getKey());
    morseBotConfig.mongoDatabase = "database";
    Assert.assertEquals("database", morseBotConfig.getMongoDatabase());
  }
}

