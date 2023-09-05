package com.learning.lang.object.String;

public class Test {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(); //initial capacity 16
        sb.append("abcdefghijklmnop");//capacity 16
        sb.append("q");//capacity 34--> NewCapacity =(currentCapacity+1)*2
        System.out.println(sb.capacity());

        StringBuffer sb1 = new StringBuffer(10);
        System.out.println(sb1.capacity());//10

        StringBuffer sb2 = new StringBuffer("Akash");
        System.out.println(sb2.capacity());//21


    }

}
