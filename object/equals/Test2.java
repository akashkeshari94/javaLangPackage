package com.learning.lang.object.equals;

public class Test2 {
    public static void main(String[] args) {
        String s1 =new String("Akash");
        String s2 = new String("Akash");

        //In string class .equals() method is overridden for content comparison, hence even though objects are different, .equals() method return true


        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true

        StringBuffer sb1 =new StringBuffer("Akash");
        StringBuffer sb2 = new StringBuffer("Akash");

        System.out.println(sb1 == sb2);//false
        System.out.println(sb1.equals(sb2));//false

        //In StringBuffer , .equals() method is not overridden , hence .equals() method return false even though content is same
    }
}
