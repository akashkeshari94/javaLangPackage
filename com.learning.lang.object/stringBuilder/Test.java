package com.learning.lang.object.String;

public class Test {

    public static void main(String[] args) {
        //method chainibg
        //For most of the methods in STring, SytringBuffer and STringBuilder, return types are same
        //types  hence after applying a method on the result, we can call anothe rtmethod which
        //forms method chaining. in method chaining, method calls wiull be executed from left to right
        StringBuffer sb = new StringBuffer(); //initial capacity 16
        sb.append("Akash").append("Keshari").insert(2,"luck").reverse().delete(2,5);
        System.out.println(sb);//ireKhsakculkA
    }
}
