package com.learning.lang.wrapper;

public class Test {
    public static void main(String[] args) {
      Boolean X = new Boolean("yes");
      Boolean Y = new Boolean("yes");
      System.out.println(X);//false
      System.out.println(Y);//false
      System.out.println(X.equals(Y));//true
    }
}
