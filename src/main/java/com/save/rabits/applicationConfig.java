package com.save.rabits;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/WS") // Set the path to REST web services
public class applicationConfig extends Application {
    private Set<java.lang.Object> singletons = new HashSet<Object>();
    private Set<Class<?>> empty = new HashSet<Class<?>>();

    public applicationConfig(){
        singletons.add(new webService());
    }

    @Override
    public Set<Object> getSingletons(){
        return singletons;
    }

    @Override
    public Set<Class<?>> getClasses(){
        return empty;
    }
}
