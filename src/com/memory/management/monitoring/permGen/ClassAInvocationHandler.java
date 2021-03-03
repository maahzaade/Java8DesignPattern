package com.memory.management.monitoring.permGen;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class ClassAInvocationHandler implements InvocationHandler {

    private final ClassA target;

    public ClassAInvocationHandler(ClassA target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("Inside invoke method in ClassAInvocationHandler. Invoked method: "+ method.getName());
        return method.invoke(target, args);
    }
}
