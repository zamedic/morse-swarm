package com.marcarndt.mose.swarm;

import com.marcarndt.morse.MorseBotConfig;
import org.wildfly.swarm.spi.runtime.annotations.ConfigurationValue;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

/**
 * Created by arndt on 2017/05/28.
 */
@Default
@Stateless
public class SwarmMorseBotConfig implements MorseBotConfig {

    /**
     * The Bot user name.
     */
    @Inject
    @ConfigurationValue("bot.username")
    String botUserName;

    /**
     * The Bot key.
     */
    @Inject
    @ConfigurationValue("bot.key")
    String botKey;

    /**
     * The Mongo url.
     */
    @Inject
    @ConfigurationValue("mongo.url")
    String mongoUrl;

    /**
     * The Mongo database.
     */
    @Inject
    @ConfigurationValue("mongo.database")
    String mongoDatabase;


    @Override
    public String getUsername() {
        return botUserName;
    }

    @Override
    public String getKey() {
        return botKey;
    }

    @Override
    public String getMongoAddress() {
        return mongoUrl;
    }

    @Override
    public String getMongoDatabase() {
        return mongoDatabase;
    }

    @Override
    public String getProxyUrl() {
        return null;
    }

    @Override
    public int getProxyPort() {
        return 0;
    }

}
