package com.learning.lang.object.String;

public class Test3 {
    public static void main(String[] args) {
        String s1= "akash";// a new object will be created in SCP only, not in heap, because there is no new keyword or any runtime operation
        String s2 = s1.toString();// no change in content, so no new object will be created

        System.out.println(s1 == s2);//true
        String s3 = s1.toLowerCase(); // no change in content, so no new object will be created

        String s4 = s1.toUpperCase(); //  change in content, so new object will be created in heap area and s4 will be pointing to that

        String s5 = s4.toLowerCase();//  change in content, so new object will be created in heap area and s5 will be pointing to that


    }
}
