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

  @Override
  public Set<Class<?>> getClasses() {
    final Reflections reflections = new Reflections();
    final Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(Api.class);
    return annotated;
  }
}
