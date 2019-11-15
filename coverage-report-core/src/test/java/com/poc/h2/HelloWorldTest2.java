package com.poc.h2;

import com.poc.HelloWorld;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest2 {

    //@org.junit.Test
    public void sayHello() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("hello", helloWorld.sayHello());
    }
}