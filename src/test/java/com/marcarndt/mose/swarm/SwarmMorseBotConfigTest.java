package com.marcarndt.mose.swarm;

import com.marcarndt.morse.MorseBotConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

/**
 * Created by arndt on 2017/05/28.
 */
public class SwarmMorseBotConfigTest {

    @Test
    public void testPojo() {
        SwarmMorseBotConfig morseBotConfig = new SwarmMorseBotConfig();
        morseBotConfig.botUserName = "test";
        Assert.assertEquals("test", morseBotConfig.getUsername());


    }
}

