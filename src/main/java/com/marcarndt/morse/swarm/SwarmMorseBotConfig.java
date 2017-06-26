package com.marcarndt.morse.swarm;

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
  protected transient String botUserName;

  /**
   * The Bot key.
   */
  @Inject
  @ConfigurationValue("bot.key")
  protected transient String botKey;

  /**
   * The Mongo url.
   */
  @Inject
  @ConfigurationValue("mongo.url")
  protected transient String mongoUrl;

  /**
   * The Mongo database.
   */
  @Inject
  @ConfigurationValue("mongo.database")
  protected transient String mongoDatabase;

  /**
   * The Mongo password.
   */
  @Inject
  @ConfigurationValue("mongo.password")
  protected transient String mongoPassword;

  @Inject
  @ConfigurationValue("proxy.url")
  protected transient String proxyUrl;

  @Inject
  @ConfigurationValue("proxy.port")
  protected int proxyPort;


  /**
   * The Mongo user.
   */
  @Inject
  @ConfigurationValue("mongo.username")
  protected transient String mongoUser;


  @Override
  /**
   *{@inheritDoc}
   */
  public String getUsername() {
    return botUserName;
  }

  @Override
  /**
   *{@inheritDoc}
   */
  public String getKey() {
    return botKey;
  }

  @Override
  /**
   *{@inheritDoc}
   */
  public String getMongoAddress() {
    return mongoUrl;
  }

  @Override
  /**
   *{@inheritDoc}
   */
  public String getMongoDatabase() {
    return mongoDatabase;
  }

  @Override
  /**
   *{@inheritDoc}
   */
  public String getProxyUrl() {
    return proxyUrl;
  }

  @Override
  /**
   *{@inheritDoc}
   */
  public int getProxyPort() {
    return proxyPort;
  }

  @Override
  /**
   *{@inheritDoc}
   */
  public String getMongoUser() {
    return mongoUser;
  }

  @Override
  /**
   *{@inheritDoc}
   */
  public String getMongoPassword() {
    return mongoPassword;
  }

}
