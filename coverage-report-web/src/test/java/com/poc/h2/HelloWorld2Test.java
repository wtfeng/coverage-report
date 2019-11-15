package com.poc.h2;

import com.poc.HelloWorld;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorld2Test {

    @Test
    public void sayHi() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("hi", helloWorld.sayHi());
    }


    @Test
    public void sayHello() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("hello", helloWorld.sayHello());
    }
}