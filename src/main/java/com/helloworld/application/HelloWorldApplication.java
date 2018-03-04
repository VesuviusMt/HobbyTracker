package com.vesuvius.application;

import com.vesuvius.resources.HelloWorld;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("rest")
public class HelloWorldApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> set = new HashSet<>();
        set.add(HelloWorld.class);
        return set;
    }
}
