package com.learning.lang.object.tostring;

public class Student {
    /*
    If our class does not contain toString method, then object class toString method will be executed
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
    */

    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Akash", 101);
        Student s2 = new Student("Lucky", 102);

        System.out.println(s1);//Student@2f92e0f4
        System.out.println(s1.toString()); //Student@2f92e0f4
        System.out.println(s2); //Student@28a418fc
    }

    //If we want our own implementation of toString() method, we can override like below, this can be achived by @ToString in lombok too.
    // Now the output will be
    // Akash..101
    //Lucky..102

    public String toString(){
        return name+".."+rollNo;
    }
}
