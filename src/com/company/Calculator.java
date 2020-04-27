package com.company;

public class Calculator {
    public void printInt() {
        int MyInt = 100;
        byte MyByte = 125;
        short MyShort = 10;
        float MyFloat = 1.5F;
        int rezultat = MyInt + MyShort;
        long MyLong = 15;
        double MyDouble = 2.33;
        System.out.println("  " + rezultat);


    }

    public  void printInt1() {
        int MyInt = 100;
        byte MyByte = 125;
        short MyShort = 10;
        float MyFloat = 1.5F;
        long MyLong = 15;
        double MyDouble = 2.33;
        float rezultat1 = MyByte / MyFloat;

        System.out.println("  " + rezultat1);
    }

    public  void printInt2() {
        int MyInt = 100;
        byte MyByte = 125;
        short MyShort = 10;
        float MyFloat = 1.5F;
        long MyLong = 15;
        double MyDouble = 2.33;

        MyInt = 8;
        MyByte = -5;
        MyShort = 6;

        float rezultat2 = MyByte + MyInt * MyShort;
        System.out.println("  " + +rezultat2);
    }

    public  void printInt3() {
        int MyInt = 100;
        byte MyByte = 125;
        short MyShort = 10;
        float MyFloat = 1.5F;
        long MyLong = 15;
        double MyDouble = 2.33;


        MyInt = 55;
        MyByte = 9;
        MyShort = 9;

        float rezultat3 = (MyInt + MyByte) % MyShort;
        System.out.println("  " + rezultat3);
    }

    public void printInt4() {
        int MyInt = 100;
        byte MyByte = 125;
        short MyShort = 10;
        float MyFloat = 1.5F;
        long MyLong = 15;
        double MyDouble = 2.33;


        MyInt = 20;
        MyByte = -3;
        MyShort = 5;
        MyFloat = 8F;

        float rezultat4 = MyInt + MyByte * MyShort / MyFloat;
        System.out.println("  " + rezultat4);
    }

    public  void printInt5() {
        int MyInt = 100;
        byte MyByte = 125;
        short MyShort = 10;
        float MyFloat = 1.5F;
        long MyLong = 15;
        double MyDouble = 2.33;
        MyInt = 5;
        MyByte = 15;
        MyShort = 3;
        MyFloat = 2F;
        MyLong = 8;
        MyDouble = 3;

        float rezultat5 = (float) (MyInt + MyByte / MyShort * MyFloat - MyLong % MyDouble);

        System.out.println("  " + rezultat5);
    }


    public int adunare() {

        int rezultat = 100 + 10;
        return rezultat;

    }

    public float impartire() {


        int rezultat1 = 100 / 25;
        return rezultat1;


    }

    public int scadere() {


        int rezultat2 = 100 - 30;
        return rezultat2;
    }

    public  int inmultire() {


        int rezultat3 = 100 * 30;
        return rezultat3;
    }

    public  void medianumerelor() {
        int x = 25;
        int y = 5;
        int z = 22;
        int Calcul = x + y + z;
        double Media = Calcul / 3;
        System.out.println("  Media Numerelor este: " + Media);

    }

    public  void restulimpartirii() {
        int x = 21;
        int y = 5;
        int Calcul = x % y;
        System.out.println("  Restul impartirii a doua numere este: " + Calcul);
    }

    public void Celsius() {
        double x = 5;
        double y = 9;
        double z = 32;
        double F = 33.8f;
        double Celsius = x / y * (F - z);
        System.out.println("  Fahrenheit: " + F);
        System.out.println("  Celsius: " + Celsius);
    }

    public  void Metri() {
        // 1 Inch = 0.0254 Metri
        double Inch = 1;
        double UnMetru;
        UnMetru = Inch / 39.370;

        System.out.println("  Un inch in Metri este: " + UnMetru);
    }

        public  void Distanta () {
            double DistantaInMetri = 100000;
            double TimpulInSecunde = 4 * 60 * 60;
            double MetriPeSecunda;
            double KmPeOra;
            double MilePeOra;

            MetriPeSecunda = DistantaInMetri / TimpulInSecunde;
            KmPeOra = (DistantaInMetri / 1000) / (TimpulInSecunde / 60) / 60;
            MilePeOra = ((DistantaInMetri / 1000) * 1.609) / ((TimpulInSecunde / 60) / 60);

            System.out.println("  Distanta in metri pe sencunda este: " + MetriPeSecunda);
            System.out.println("  Distanta in km pe ora este: " + KmPeOra);
            System.out.println("  Distanta in MilePeOra este: " + MilePeOra);

        }
    }

