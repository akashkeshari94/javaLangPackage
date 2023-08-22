package com.learning.lang.object.immutability;
//Way to create out own mutable class
public class Test {

    int i;

    public Test(int i){
        this.i= i;
    }

    public Test modify(int i){
        if(this. i ==i ){
            return this;
        }else {
            return new Test(i);
        }
    }

    public static void main(String[] args) {
        final StringBuffer sb = new StringBuffer("akash");
        sb.append("keshari");
        System.out.println(sb);

       // sb = new StringBuffer("lucky");//can not assign a value to a final variable
    }
}
