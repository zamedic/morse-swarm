package com.marcarndt.morse.rest;

import io.swagger.annotations.Api;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import org.reflections.Reflections;

/**
 * Created by arndt on 2017/06/25.
 */
@ApplicationPath("/api")
public class APIApplication extends Application {

  /**
   * Annotated classes.
   */
  private transient Set<Class<?>> annotated;


  /**
   * Reutnr s alist of API Classes. Auto detects any class with the @API annotation.
   *
   * @return Set of classes
   */
  @Override
  public Set<Class<?>> getClasses() {
    if (annotated == null) {
      final Reflections reflections = new Reflections();
      annotated = reflections.getTypesAnnotatedWith(Api.class);
    }
    return annotated;
  }
}
