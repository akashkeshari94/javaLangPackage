package com.learning.lang.object.getclass;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
        int count =0;
        Object obj = new String("Akash");
        Class c= obj.getClass();
        System.out.println("Fully qualified name of the class: "+ c.getName());

        Method[] m = c.getDeclaredMethods();
        System.out.println("method information:");
        for(Method m1 : m){
            count++;
            System.out.println(m1.getName());
        }
        System.out.println("Total method count is "+count);
    }
}
