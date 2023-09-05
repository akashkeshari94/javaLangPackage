package com.learning.lang.object.String;

public class Test {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(); //initial capacity 16
        sb.append("abcdefghijklmnop");//capacity 16
        sb.append("q");//capacity 34--> NewCapacity =(currentCapacity+1)*2
        System.out.println(sb.capacity());

        StringBuffer sb1 = new StringBuffer(10);
        System.out.println(sb1.capacity());//10

        StringBuffer sb2 = new StringBuffer("Akash");
        System.out.println(sb2.capacity());//21

        //Important methods of StringBuffer
        System.out.println(sb2.charAt(3));//s
        //System.out.println(sb2.charAt(30));//StringIndexOutOfBoundException
        sb2.setCharAt(2,'b');
        System.out.println(sb2);//Akbsh

        //overloaded append
        StringBuffer sb4 = new StringBuffer();
        sb4.append("PI value is: ");
        sb4.append(3.14);
        sb4.append(" It is exactly: ");
        sb4.append(true);
        System.out.println(sb4);

        StringBuffer sb5 = new StringBuffer("Akash");
        sb5.insert(2,"luck");
        System.out.println(sb5);//Akluckash

        StringBuffer sb6 = new StringBuffer("Akash");
        System.out.println(sb6.deleteCharAt(2));//Aksh

        StringBuffer sb7 = new StringBuffer("Akash");
        System.out.println(sb7.delete(2,4));//Akh


        StringBuffer sb8 = new StringBuffer("Akash");
        System.out.println(sb8.reverse());//hsakA

        StringBuffer sb9 = new StringBuffer("AkashKeshari");
        sb9.setLength(6);
        System.out.println(sb9);//AkashK

        StringBuffer sb10 = new StringBuffer();//initail capacity 16
        sb10.ensureCapacity(1000);
        System.out.println(sb10.capacity());//1000

        StringBuffer sb11 = new StringBuffer(1000);//initail capacity 1000
        sb11.append("abc");
        sb11.trimToSize();
        System.out.println(sb11.capacity());//3













    }

}
