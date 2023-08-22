package com.learning.lang.object.equals;

public class Student {

    String name;
    int rollNo;

    public Student(String name, int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }

    public static void main(String[] args) {
        Student s1= new Student("Akash",101);
        Student s2= new Student("Lucky", 102);
        Student s3= new Student("Akash", 101);
        Student s4=s1;
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equals(s3));//false
        System.out.println(s1.equals(s4));//true
        System.out.println(s1.equals("Akash"));//it will give classCastException with overridden equals() method and false with Object class
        // equals() methods, so we need to handle this in overridden method
        System.out.println(s1.equals(null));//it will give NullPointerException with overridden equals() method and false with Object class
        // equals() methods,  so we need to handle this in overridden method
    }

    //override equals method

//    @Override
//    public boolean equals(Object obj) {
//       try{
//            String name1=this.name;
//            int rollNo1= this.rollNo;
//
//            Student s1= (Student) obj;
//            String name2=s1.name;
//            int rollNo2= s1.rollNo;
//
//            if(name1.equals(name2) && rollNo1==rollNo2){ // String class .equals method is for content comparison
//                return  true;
//            }else {
//                return false;
//            }
//        }catch (ClassCastException e){
//            return false;
//        }catch (NullPointerException e){
//            return false;
//        }
//
//
//    }
    //Now the output will be
//    false
//    true
//    true


    //Better way to override

//    @Override
//    public boolean equals(Object obj) {
//        try{
//
//           Student s1= (Student) obj;
//
//
//            if(name.equals(s1.name) && rollNo== s1.rollNo){ // String class .equals method is for content comparison
//                return  true;
//            }else {
//                return false;
//            }
//        }catch (ClassCastException e){
//            return false;
//        }catch (NullPointerException e){
//            return false;
//        }
//
//
//    }

//    //more simpleifiedn version of equals method
//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Student) {
//            Student s1 = (Student) obj;
//
//            if (name.equals(s1.name) && rollNo == s1.rollNo) { // String class .equals method is for content comparison
//                return true;
//            } else {
//                return false;
//            }
//        }
//        return false;
//    }


    //more simpleifiedn version of equals method
    @Override
    public boolean equals(Object obj) {
        if(obj == this){ // if both references pointing to same objects, it will return true without comparing any properties
            return true;
        }
        if (obj instanceof Student) {
            Student s1 = (Student) obj;

            if (name.equals(s1.name) && rollNo == s1.rollNo) { // String class .equals method is for content comparison
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

}
