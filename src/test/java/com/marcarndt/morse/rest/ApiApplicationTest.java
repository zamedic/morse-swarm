package com.marcarndt.morse.rest;

import static org.junit.Assert.assertEquals;
import static org.powermock.api.mockito.PowerMockito.whenNew;

import io.swagger.annotations.Api;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.reflections.Reflections;

/**
 * Created by arndt on 2017/06/25.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Reflections.class, ApiApplication.class})
public class ApiApplicationTest {

  @Mock
  private Reflections reflections;

  @InjectMocks
  private ApiApplication apiApplication;

  @Test
  public void getClasses() throws Exception {
    whenNew(Reflections.class).withParameterTypes(Object[].class)
        .withArguments(ArgumentMatchers.any()).thenReturn(reflections);
    Set<Class<?>> classes = new HashSet<>(Arrays.asList(Alert.class));
    Mockito.when(reflections.getTypesAnnotatedWith(Api.class)).thenReturn(classes);
    Set<Class<?>> response = apiApplication.getClasses();
    assertEquals(1, response.size());
  }

}