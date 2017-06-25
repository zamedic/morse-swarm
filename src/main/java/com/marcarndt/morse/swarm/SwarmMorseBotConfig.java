package com.marcarndt.morse.swarm;

import com.marcarndt.morse.MorseBotConfig;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import org.wildfly.swarm.spi.runtime.annotations.ConfigurationValue;

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
    return null;
  }

  @Override
  /**
   *{@inheritDoc}
   */
  public int getProxyPort() {
    return 0;
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