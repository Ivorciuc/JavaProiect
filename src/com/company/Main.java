package com.company;

public class Main {

    public static void main(String[] args) {
System.out.println("Hello");
        System.out.println("Adrian");

        int MyInt = 100;
        byte MyByte = 125;
        short MyShort = 10;
        float MyFloat = 1.5F;
        int resultat = MyInt + MyShort;
        long MyLong = 15;
        double MyDouble = 2.33;
System.out.println(resultat);

float resultat1 =  MyByte / MyFloat;

System.out.println (resultat1);

MyInt = 8;
MyByte = -5;
MyShort = 6;

float resultat2 = MyByte + MyInt * MyShort;

System.out.println("A." +resultat2);

MyInt = 55;
MyByte = 9;
MyShort = 9;

float resultat3 = (MyInt + MyByte) % MyShort;

System.out.println("B." +resultat3);

MyInt = 20;
MyByte = -3;
MyShort = 5;
MyFloat = 8F;

float resultat4 = MyInt + MyByte * MyShort / MyFloat;

System.out.println("C." +resultat4);

MyInt = 5;
MyByte = 15;
MyShort = 3;
MyFloat = 2F;
MyLong = 8;
MyDouble = 3;

float resultat5 = (float) (MyInt + MyByte / MyShort * MyFloat - MyLong % MyDouble);

System.out.println("D." +resultat5);




    }
}
