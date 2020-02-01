package com.kovalchv;

public class Main {

    public static void main(String... args) {

        Person person = new Person();

        MyClass myClass = MyClass.getInstance();
        MyClass secondClass = MyClass.getInstance();
        myClass.name = "Class";

        System.out.println(myClass);
        System.out.println(secondClass);

        System.out.println("Object person: " + person);
    }

}
