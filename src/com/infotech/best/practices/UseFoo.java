package com.infotech.best.practices;

import java.util.function.Function;

public class UseFoo {

    public static String add(String name, Function<String, String> fn) {
        return fn.apply(name);
    }
}
