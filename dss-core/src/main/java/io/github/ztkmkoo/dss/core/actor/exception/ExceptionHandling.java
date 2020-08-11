package io.github.ztkmkoo.dss.core.actor.exception;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ExceptionHandling{
    Class<? extends ExceptionHandler> handler();
    Class<? extends Exception> exception() default Exception.class;
}