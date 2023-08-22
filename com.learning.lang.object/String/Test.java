package com.learning.lang.object.String;

public class Test {



    public static void main(String[] args) {
        String str = new String("Akash");
        str.concat("Keshari"); // Since String is immutable object, a new String "AkashKeshari" will be created and
        // original String "Akash" won't be changed. Since str is pointing to original String "Akash" that will be printed

        System.out.println(str);//Akash
        //If we assign str.concat("Keshari") to any variable, then the new String will be printed



        StringBuffer stringBuffer= new StringBuffer("Akash");
        stringBuffer.append("Keshari");
        System.out.println(stringBuffer);//AkashKeshari because StringBuffer is mutable type

    }

}
