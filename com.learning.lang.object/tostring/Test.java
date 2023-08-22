package com.learning.lang.object.tostring;

import java.util.ArrayList;

public class Test {

    //    in all wrapper classes, collection classes, StringBuffer and StringBuilder cLasses, toString() method is overridden to give
//    meaningful representation
    public static void main(String[] args) {
        String s = new String("Akash");
        System.out.println(s);//Akash
        Integer i = new Integer(10);
        System.out.println(i);//10
        ArrayList a = new ArrayList<>();
        a.add("A");
        a.add("B");
        System.out.println(a);//[A, B]

        Test t = new Test();

        System.out.println(t);//com.learning.lang.object.tostring.toString.Test@2f92e0f4 --> when toSTring() not overridden

    }
    //So it is always recommended to override toString() method for our class too
    //Now the output will be
    //System.out.println(t) -->test

    public String toString() {
        return "test";

    }
}
