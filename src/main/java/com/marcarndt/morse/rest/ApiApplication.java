package com.marcarndt.morse.rest;

import io.swagger.annotations.Api;
import org.reflections.Reflections;

import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


/**
 * Created by arndt on 2017/06/25.
 */
@ApplicationPath("/api")
public class ApiApplication extends Application {

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
