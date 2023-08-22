package com.learning.lang.object.hashCode;

public class Test {
    int i;

    public Test(int i) {
        this.i = i;

    }

    public static void main(String[] args) {
        Test t1 = new Test(10);
        Test t2 = new Test(100);

        System.out.println(t1);
        System.out.println(t2);//If we are not overriding hashcode method, we will get some random output like Test@someHexadecimalNumber
    }
    //overriding hashcode method
    public int hashCode(){
        return i;
    }

    //Now the output will be
    //com.learning.lang.object.hashCode.Test@a  --> because 10 in hexadecimal is a
    //com.learning.lang.object.hashCode.Test@64 --> because 100 in hexadecimal is 64

    //if we override toString() too, hashcode() will not be executed
    public String toString(){
        return i+"";
    }

    //Now the output will be
    //10
    //100
}
