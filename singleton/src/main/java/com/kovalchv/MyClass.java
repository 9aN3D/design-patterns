package com.kovalchv;

import lombok.ToString;

import static java.util.Objects.isNull;

//@ToString()
public class MyClass {

    private static MyClass instance;

    String name;

    private MyClass() {
    }

    public static synchronized MyClass getInstance() {
        // Adding the synchronized keyword makes our singleton thread safe.
        if (isNull(instance)) {
            instance = new MyClass();
        }

        return instance;
    }

}
