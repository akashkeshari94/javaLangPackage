package com.learning.lang.object.String;

import java.util.Locale;

public class Test2 {

    //Different constructors in String

    String str1 = new String(); // Will create a string with emplty Strig and not wil null

    String str2 = new String("Akjash"); // one new onject wil be craetre din heap area and one in conhtsnat pool

    //StringBuffer sb= new StringBuffer("Hello");
    String str3 = new String(new StringBuffer("Hello"));

    String str4 = new String(new char[]{'a', 'b', 'c', 'd'});

    byte[] b={100, 101, 102, 103};
    String str5 = new String(b);

    public static void main(String[] args) {

        Test2 test = new Test2();
        System.out.println("String one: "+test.str1);
        System.out.println("String two: "+test.str2);
        System.out.println("String three: "+test.str3);
        System.out.println("String four: "+test.str4);
        System.out.println("String one: "+test.str5);

        //methods in String class

        //public char charAt(int index)

        System.out.println("Akash".charAt(3));//s
        //System.out.println("Akash".charAt(30));//StringIndexOutOfBoundException

        //public String concat(String s)
        System.out.println("Akash".concat(" Keshari"));

        //public boolean equals(Object o)
        System.out.println("Akash".equals("akash"));//false
        System.out.println("Akash".equalsIgnoreCase("AkAsH"));//true

        //public String substring(int begin)
        System.out.println("Akash".substring(2));//ash

        //public String substring(int begin, int end)
        System.out.println("Akash".substring(1,3));//ka

        //public int length()
        System.out.println("Akash".length());//5

        //public String replace()
        System.out.println("Akash".replace('a','b'));//akbsh

        //public String toLowerCase()
        System.out.println("Akash".toLowerCase());//akash

        //public String toUpperCase()
        System.out.println("Akash".toUpperCase());//AKASH

        //public String trim()
        System.out.println("    Ak ash   ".trim());//Ak ash --> extra space will be removed at beginning and at the end


        //Because of run time operation, if there is any change in the content, then with those changes, a new object will be created on the heap,
        //if there is no change in the content, existing object will be reused and no new object will be created.
        //Whether the object present in heap or SCP , the rule is same.

        String s1 = new String("lucky");
        String s2 = s1.toUpperCase();
        String s3 = s1.toLowerCase();
        System.out.println(s1 == s2);//false
        System.out.println(s1 == s3); //true , here because there is no change in the content, so no new object will be
        // created and s1 and s3 will be pointing to the same object

        String s4 = s2.toLowerCase(); //a new object will be created because there is change in the content(from LUCKY to lucky)

        String s5 = s4.toUpperCase();//a new object will be created because there is change in the content(from lucky to LUCKY)
    }






}
